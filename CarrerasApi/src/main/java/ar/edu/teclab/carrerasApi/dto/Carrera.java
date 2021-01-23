package ar.edu.teclab.carrerasApi.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "carrera")
@Entity
public class Carrera {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private int materias;
	private String tipo;
	private String facultad;
	
	public Carrera() {
		
	}
	
	public Carrera(Long id, String nombre, int materias, String tipo, String facultad) {
		this.id = id;
		this.nombre = nombre;
		this.materias = materias;
		this.tipo = tipo;
		this.facultad = facultad;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getMaterias() {
		return materias;
	}
	public void setMaterias(int materias) {
		this.materias = materias;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getFacultad() {
		return facultad;
	}
	public void setFacultad(String facultad) {
		this.facultad = facultad;
	}

	@Override
	public String toString() {
		return "Carrera [id=" + id + ", nombre=" + nombre + ", materias=" + materias + ", tipo=" + tipo
				+ ", facultad=" + facultad + "]";
	}
	
	
	
}
