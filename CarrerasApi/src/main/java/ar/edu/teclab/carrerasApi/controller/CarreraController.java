package ar.edu.teclab.carrerasApi.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.teclab.carrerasApi.dto.Carrera;
import ar.edu.teclab.carrerasApi.service.CarreraService;

@RestController
@RequestMapping("/carrera")
@CrossOrigin(origins = "*")
public class CarreraController {

	private static final Log LOG = LogFactory.getLog(CarreraController.class);

	@Autowired
	protected CarreraService carreraService;

	@GetMapping("/listarCarreras")
	public List<Carrera> litarCarreras(Carrera carrera) {
		try {
			return carreraService.listarCarreras();

		} catch (Exception e) {
			LOG.error("Error", e);
		}
		return null;
	}

	@PostMapping("/altaCarrera")
	public Carrera insertarCarrera(@RequestBody Carrera carrera) {
		try {
			return carreraService.AltaCarrera(carrera);
		} catch (Exception e) {
			LOG.error("Error", e);
		}
		return null;
	}

	@DeleteMapping("/eliminarCarrera/{id}")
	public void eliminarCarrera(@PathVariable(name = "id") Long id) {
		try {
			Carrera carreraAEliminar = carreraService.buscarPorId(id);
			carreraService.eliminar(carreraAEliminar);
		} catch (Exception e) {
			LOG.error("Error", e);
		}
	}

	@PutMapping("/modificarCarrera/{id}")
	public Carrera editarCarrera(@PathVariable(name = "id") Long id, @RequestBody Carrera carrera) {
		try {
			Carrera carreraSeleccionada = carreraService.buscarPorId(id);
			carreraSeleccionada.setNombre(carrera.getNombre());
			carreraSeleccionada.setMaterias(carrera.getMaterias());
			carreraSeleccionada.setTipo(carrera.getTipo());
			carreraSeleccionada.setFacultad(carrera.getFacultad());
			return carreraService.modificarCarrera(carreraSeleccionada);

		} catch (Exception e) {
			LOG.error("Error", e);
		}
		return null;
	}

}
