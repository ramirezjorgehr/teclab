package ar.edu.teclab.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Metadata {

	private System system;
	private Metadata metadata;
	
	public System getSystem() {
		return system;
	}
	public void setSystem(System system) {
		this.system = system;
	}
	public Metadata getMetadata() {
		return metadata;
	}
	public void setMetadata(Metadata metadata) {
		this.metadata = metadata;
	}
	@Override
	public String toString() {
		return "Metadata [system=" + system + ", metadata=" + metadata + "]";
	}
	
	
	
}
