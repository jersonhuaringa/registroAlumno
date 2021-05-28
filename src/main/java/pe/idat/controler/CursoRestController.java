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

import pe.idat.entity.Curso;
import pe.idat.service.CursoService;

@RestController
@RequestMapping("/curso/v1")
public class CursoRestController {


			@Autowired
			private CursoService cursoService;

			@GetMapping("/listar")
			public ResponseEntity<?> listar(){
				Collection<Curso> curso=cursoService.findAll();
				return new ResponseEntity<>(curso,HttpStatus.OK);
			}
			
			@PostMapping("/registrar")
			public ResponseEntity<?> registrar(@RequestBody Curso curso){
				cursoService.insert(curso);
				
				return new ResponseEntity<Void>(HttpStatus.CREATED);
			}
			
			
			

}
