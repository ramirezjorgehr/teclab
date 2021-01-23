package ar.edu.teclab.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Via {
	private String channel;
	private Source source;
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
	public Source getSource() {
		return source;
	}
	public void setSource(Source source) {
		this.source = source;
	}
	
	@Override
	public String toString() {
		return "Via [channel=" + channel + ", source=" + source + "]";
	}
	

	

}
