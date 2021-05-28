package pe.idat.controler;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.idat.entity.Alumno;
import pe.idat.entity.Curso;
import pe.idat.service.AlumnoService;
import pe.idat.service.CursoService;

@RestController
@RequestMapping("/curso_alumno/v1")
public class CursoAlumnoRestControler {
	@Autowired
	private CursoService cursoService;
	@Autowired
	private AlumnoService alumnoService;

	/*@GetMapping("/listar")
	public ResponseEntity<?> listar(){
		Collection<Horario> horario=horarioService.findAll();
		return new ResponseEntity<>(horario,HttpStatus.OK);
	}*/
	
	@PostMapping("/registrar")
	public ResponseEntity<?> registrar(@RequestBody CursoAlumno cursoAlumno){
		Curso curso=cursoService.findById(cursoAlumno.getCurso().getCursoId());
		
		if(curso!=null) {
			Alumno alumnoDb=alumnoService.findById(cursoAlumno.getAlumno().getSchoolId());
			curso.addAlumno(alumnoDb);
			
			cursoService.insert(curso); 
			
			return new ResponseEntity<Void>(HttpStatus.CREATED);
		}
		
		return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
	}
}
