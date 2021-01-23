package ar.edu.teclab.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Comentario {
	private List<Adjunto> attachments;
	private Long author_id;
	private String body;
	private String created_at;
	private Long id;
	private Metadata metadata;
	
	@JsonProperty("public")
	private boolean publico ;
	private String type;
	
	public List<Adjunto> getAttachments() {
		return attachments;
	}
	public void setAttachments(List<Adjunto> attachments) {
		this.attachments = attachments;
	}
	public Long getAuthor_id() {
		return author_id;
	}
	public void setAuthor_id(Long author_id) {
		this.author_id = author_id;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getCreated_at() {
		return created_at;
	}
	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Metadata getMetadata() {
		return metadata;
	}
	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}
	public boolean isPublico() {
		return publico;
	}
	public void setPublico(boolean publico) {
		this.publico = publico;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Comentario [attachments=" + attachments + ", author_id=" + author_id + ", body=" + body
				+ ", created_at=" + created_at + ", id=" + id + ", metadata=" + metadata + ", publico=" + publico
				+ ", type=" + type + "]";
	}
	
	
	
	
	
	

}
