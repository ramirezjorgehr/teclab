package ar.edu.teclab.carrerasApi.entity;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.edu.teclab.carrerasApi.dto.Carrera;

public interface ICarrera extends JpaRepository<Carrera, Long>{

}
