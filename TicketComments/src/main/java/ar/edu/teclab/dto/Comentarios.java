package ar.edu.teclab.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Comentarios {
	
	@JsonProperty("comments")
	private List<Comentario> comentarios;

	public List<Comentario> getComentarios() {
		return comentarios;
	}

	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}

	@Override
	public String toString() {
		return "Comentarios [comentarios=" + comentarios + "]";
	}
	
	
	

}
