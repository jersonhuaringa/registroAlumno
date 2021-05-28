package pe.idat.controler;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.idat.entity.Profesor;
import pe.idat.service.ProfesorService;

@RestController
@RequestMapping("/profesor/v2")
public class ProfesorRestController {

	@Autowired
	private ProfesorService profesorService;

	@GetMapping("/listar")
	public ResponseEntity<?> listar(){
		Collection<Profesor> profesor=profesorService.findAll();
		return new ResponseEntity<>(profesor,HttpStatus.OK);
	}
	
	@PostMapping("/registrar")
	public ResponseEntity<?> registrar(@RequestBody Profesor profesor){
		profesorService.insert(profesor);
		
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
}

//fechlazy