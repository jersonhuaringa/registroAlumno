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

import pe.idat.entity.Horario;
import pe.idat.service.HorarioService;

@RestController
@RequestMapping("/horario/v1")
public class HorarioRestController {

		@Autowired
		private HorarioService horarioService;

		@GetMapping("/listar")
		public ResponseEntity<?> listar(){
			Collection<Horario> horario=horarioService.findAll();
			return new ResponseEntity<>(horario,HttpStatus.OK);
		}
		
		@PostMapping("/registrar")
		public ResponseEntity<?> registrar(@RequestBody Horario horario){
			horarioService.insert(horario);
			
			return new ResponseEntity<Void>(HttpStatus.CREATED);
		}
	
}
