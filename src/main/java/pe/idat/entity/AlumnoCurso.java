package pe.idat.entity;

public class AlumnoCurso {

	private Curso curso;
	private Alumno alumno;
	
	public AlumnoCurso() {
	}

	public AlumnoCurso(Curso curso, Alumno alumno) {
		super();
		this.curso = curso;
		this.alumno = alumno;
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
}
