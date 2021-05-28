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

import pe.idat.entity.Notas;
import pe.idat.service.NotasService;


@RestController
@RequestMapping("/notas/v1")
public class NotasRestController {
	

		@Autowired
		private NotasService notasService;

		@GetMapping("/listar")
		public ResponseEntity<?> listar(){
			Collection<Notas> notas=notasService.findAll();
			return new ResponseEntity<>(notas,HttpStatus.OK);
		}
		
		@PostMapping("/registrar")
		public ResponseEntity<?> registrar(@RequestBody Notas notas){
			notasService.insert(notas);
			
			return new ResponseEntity<Void>(HttpStatus.CREATED);
		}

}
