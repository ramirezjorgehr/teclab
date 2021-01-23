package ar.edu.teclab.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Source {
	
	private FromVia from;
	private ToVia to;
	private String rel;
	
	public FromVia getFrom() {
		return from;
	}
	public void setFrom(FromVia from) {
		this.from = from;
	}
	public ToVia getTo() {
		return to;
	}
	public void setTo(ToVia to) {
		this.to = to;
	}
	public String getRel() {
		return rel;
	}
	public void setRel(String rel) {
		this.rel = rel;
	}
	@Override
	public String toString() {
		return "Source [from=" + from + ", to=" + to + ", rel=" + rel + "]";
	}
	
	

}
