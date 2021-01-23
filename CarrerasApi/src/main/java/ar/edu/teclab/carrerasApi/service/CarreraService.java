package ar.edu.teclab.carrerasApi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.teclab.carrerasApi.dto.Carrera;
import ar.edu.teclab.carrerasApi.entity.ICarrera;

@Service
public class CarreraService {
	
	@Autowired
	ICarrera carreraEntity;
	
	public List<Carrera> listarCarreras(){
		return carreraEntity.findAll();
	}
	
	public Carrera AltaCarrera(Carrera carrera) {
		return carreraEntity.save(carrera);
	}
	
	public Carrera  buscarPorId(Long id) {
		return carreraEntity.findById(id).get();
	}
	
	public Carrera modificarCarrera(Carrera carrera) {
		return carreraEntity.save(carrera);
	}
	
	public void eliminar(Carrera carrera) {
		carreraEntity.delete(carrera);
	}

}
