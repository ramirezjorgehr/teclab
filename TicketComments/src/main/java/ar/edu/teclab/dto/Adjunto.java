package ar.edu.teclab.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Adjunto {
	
	private String content_type;
	private String content_url;
	private String file_name;
	private Long id;
	private Long size;
	private List<String> thumbnails;
	public String getContent_type() {
		return content_type;
	}
	public void setContent_type(String content_type) {
		this.content_type = content_type;
	}
	public String getContent_url() {
		return content_url;
	}
	public void setContent_url(String content_url) {
		this.content_url = content_url;
	}
	public String getFile_name() {
		return file_name;
	}
	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getSize() {
		return size;
	}
	public void setSize(Long size) {
		this.size = size;
	}
	public List<String> getThumbnails() {
		return thumbnails;
	}
	public void setThumbnails(List<String> thumbnails) {
		this.thumbnails = thumbnails;
	}
	@Override
	public String toString() {
		return "Adjunto [content_type=" + content_type + ", content_url=" + content_url + ", file_name=" + file_name
				+ ", id=" + id + ", size=" + size + ", thumbnails=" + thumbnails + "]";
	}
	
	

}
