package ar.edu.teclab.TicketComments;

import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.net.URI;
import java.net.http.HttpRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import ar.edu.teclab.dto.Comentario;
import ar.edu.teclab.dto.Comentarios;
import java.util.Base64;

@SpringBootApplication
public class TicketCommentsApplication {

	private static final Logger log = LoggerFactory.getLogger(TicketCommentsApplication.class);
	private List<Comentario> comentarioList = new ArrayList<>();
	private String urlListarComentariosTicket12 = "https://teclab1593636133.zendesk.com/api/v2/tickets/12/comments";

	public static void main(String[] args) {
		SpringApplication.run(TicketCommentsApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	//traigo los comentarios del ticket id = 12
	@Bean
	public CommandLineRunner listarComentarios(RestTemplate restTemplate) throws Exception {
		return args -> {
			String plainCreds = "jorge.danni@teclab.edu.ar:Abril2019";
			byte[] plainCredsBytes = plainCreds.getBytes();
			byte[] base64CredsBytes = Base64.getEncoder().encode(plainCredsBytes);
			String base64Creds = new String(base64CredsBytes);
			HttpHeaders headers = new HttpHeaders();
			headers.add("Authorization", "Basic " + base64Creds);
			HttpEntity<String> request = new HttpEntity<String>(headers);
			ResponseEntity<Object> response = restTemplate.exchange(urlListarComentariosTicket12, HttpMethod.GET,
					request, Object.class);
			log.info(response.getBody().toString());
		};
	}

	//inserto un comentario en el ticket id=12
	@Bean
	public CommandLineRunner insertarComentario(RestTemplate restTemplate) throws Exception {
		return args -> {
			String requestJson = "{\"ticket\": {\"comment\": {\"body\": \"comentario añadido por Jorge Ramirez\", \"author_id\": 494820284}}}";
			String url = "https://teclab1593636133.zendesk.com/api/v2/tickets/12";
			String plainCreds = "jorge.danni@teclab.edu.ar:Abril2019";
			byte[] plainCredsBytes = plainCreds.getBytes();
			byte[] base64CredsBytes = Base64.getEncoder().encode(plainCredsBytes);
			String base64Creds = new String(base64CredsBytes);
			HttpHeaders headers = new HttpHeaders();
			headers.add("Authorization", "Basic " + base64Creds);
			headers.setContentType(MediaType.APPLICATION_JSON);
			HttpEntity<String> request = new HttpEntity<String>(headers);
			request = new HttpEntity<String>(requestJson, headers);
			ResponseEntity<Object> response = restTemplate.exchange(url, HttpMethod.PUT, request, Object.class);
			log.info(response.getBody().toString());
		};
	}

	//traigo los comentarios del ticket id=12 y los mapeo con la clase comentarios
	@Bean
	public CommandLineRunner traerComentarioList(RestTemplate restTemplate) throws Exception {
		Authenticator.setDefault(new Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("jorge.danni@teclab.edu.ar", "Abril2019".toCharArray());
			}
		});
		return args -> {
			Comentarios comentarioList = restTemplate.getForObject(urlListarComentariosTicket12, Comentarios.class);
			log.info(comentarioList.toString());
		};
	}
}
