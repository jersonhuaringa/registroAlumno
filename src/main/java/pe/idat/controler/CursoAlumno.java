package pe.idat.controler;

import pe.idat.entity.Alumno;
import pe.idat.entity.Curso;

public class CursoAlumno {
	private Curso curso;
	private Alumno alumno;
	
	public CursoAlumno() {
		
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public CursoAlumno(Curso curso, Alumno alumno) {
		super();
		this.curso = curso;
		this.alumno = alumno;
	}
	
	 

}
