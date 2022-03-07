package Api.com.dragonball.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Api.com.dragonball.entity.Dragonball;
import Api.com.dragonball.repository.IDragonBallRepository;

@RestController
@RequestMapping("/apiDragonball/v1")
public class DragonballResource {
	
	
	@Autowired
	private IDragonBallRepository dragonballRepository;

	
	
	@GetMapping("/personajes")
	
	public List<Dragonball> findAll(){
		
		return dragonballRepository.findAll();
		
	}
	
	
	@PostMapping("/personaje")
	
	public Dragonball create(@RequestBody Dragonball dragonball) {
		
		return dragonballRepository.save(dragonball);
	}
	
	
	
	
	@PutMapping("/personaje/{id}")
	
	public Dragonball update(@RequestBody Dragonball dragonball, @PathVariable Integer id) {
		
		Dragonball actualizarPersonaje = dragonballRepository.getById(id);
		
		actualizarPersonaje.setNombre(dragonball.getNombre());
		actualizarPersonaje .setRaza(dragonball.getRaza());
		actualizarPersonaje .setGenero(dragonball.getGenero());
		actualizarPersonaje .setLugarDeNacimiento(dragonball.getLugarDeNacimiento());
		actualizarPersonaje .setEdad(dragonball.getEdad());
		actualizarPersonaje .setEstado(dragonball.getEstado());
		
		return dragonballRepository.save(actualizarPersonaje);
	
	}
	
	
	
	
	@DeleteMapping("/personaje/{id}")
	
	public void delete(@PathVariable Integer id) {
		
		dragonballRepository.deleteById(id);
	}
	
	
	
	
	
	
	
	
}
