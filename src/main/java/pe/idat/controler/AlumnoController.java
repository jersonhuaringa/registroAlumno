package pe.idat.controler;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.idat.entity.Alumno;
import pe.idat.service.AlumnoService;

@RestController
@RequestMapping("/alumno/v1")
public class AlumnoController {
	
	@Autowired
	private AlumnoService alumnoService;
	
	@GetMapping("/listar")
	public ResponseEntity<?> listar(){
		Collection<Alumno> alumno=alumnoService.findAll();
		return new ResponseEntity<>(alumno,HttpStatus.OK);
	}
	
	@PostMapping("/registrar")
	public ResponseEntity<?> registrar(@RequestBody Alumno alumno){
		alumnoService.insert(alumno);
		
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@PutMapping("/editar/{alumnoId}")
	public ResponseEntity<?> editar(@RequestBody Alumno alumno,@PathVariable Integer alumnoId){
		Alumno alumnoDb=alumnoService.findById(alumnoId);
		
		if(alumnoDb!=null) {
			alumnoDb.setNombre(alumno.getNombre());
			alumnoDb.setApellido(alumno.getApellido());
			alumnoDb.setSexo(alumno.getSexo());
			alumnoDb.setCodAlumno(alumno.getCodAlumno());
			alumnoDb.setTelefono(alumno.getTelefono());
			alumnoDb.setDireccion(alumno.getDireccion());
			alumnoService.update(alumnoDb);
			
			return new ResponseEntity<>("¡Estudiante actualizado!", HttpStatus.OK);
		}
		
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
	
	@DeleteMapping("/borrar/{alumnoId}")
	public ResponseEntity<?> borrar(@PathVariable Integer alumnoId){
		Alumno schoolDb=alumnoService.findById(alumnoId);
		
		if(alumnoId!=null){
			alumnoService.delete(alumnoId);
		
			return new ResponseEntity<>("¡Estudiante eliminado!",HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("/buscar/{alumnoId}")
	public ResponseEntity<?> buscar(@PathVariable Integer alumnoId){
		Alumno schoolDb=alumnoService.findById(alumnoId);
		
		if(alumnoId!=null) {
			return new ResponseEntity<>(alumnoId,HttpStatus.OK);
		}
		
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
	
	@GetMapping("/buscarxNombre/{nombre}")
	public ResponseEntity<?> buscarNombre(@PathVariable String nombre){
		Alumno alumnoDb=alumnoService.findByNombre(nombre);
		
		if (alumnoDb!=null) {
			return new ResponseEntity<>(alumnoDb,HttpStatus.OK);
		}
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
}
