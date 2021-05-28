	package pe.idat.entity;
	
	import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
	import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
	import javax.persistence.Table;

	
	@Entity
	@Table(name="cursos")
	public class Curso implements Serializable{
	
		private static final long serialVersionUID = 1L;
		
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private Integer cursoId;
		
		@Column
		private String curso;
		
		
		@ManyToMany
		@JoinTable(name="cursos_alumno", joinColumns = @JoinColumn(name ="curso_id",nullable=false, 
		foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(curso_id) references cursos(curso_id)")),
		inverseJoinColumns = @JoinColumn(name="alumno_id",nullable=false,
		foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(alumno_id) references alumnos(school_id)"))                             )
		private Set<Alumno> itemsAlumno=new HashSet<>();
		
		@OneToOne
		@JoinColumn(name="profesor_id",nullable=false,unique=true,foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(profesor_id) references profesores(profesor_id)"))
		private Profesor profesor;
		
		@OneToOne
		@JoinColumn(name="nota_id",nullable = false,unique=true, foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(nota_id) references notas(nota_id)"))
		private Notas nota;
		
		@ManyToOne
		@JoinColumn(name="horarios_id",nullable = false,unique=true, foreignKey = @ForeignKey(foreignKeyDefinition = "foreign key(horarios_id) references horarios(horarios_id)"))
		private Horario itemsHorario;
		
		
		
		public void addAlumno(Alumno alumno) {
			itemsAlumno.add(alumno);
			alumno.getItemCurso().add(this);
		}
	
	public Curso() { 
	}
	
	public Integer getCursoId() {
		return cursoId;
	}
	
	public void setCursoId(Integer cursoId) {
		this.cursoId = cursoId;
	}
	
	public String getCurso() {
		return curso;
	}
	
	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public Curso(Integer cursoId, String curso) {
		this.cursoId = cursoId;
		this.curso = curso;
	}
	
	public Profesor getProfesor() {
		return profesor;
	}
	
	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public Notas getNota() {
		return nota;
	}

	public void setNota(Notas nota) {
		this.nota = nota;
	}

	public Set<Alumno> getItemsAlumno() {
		return itemsAlumno;
	}

	public void setItemsAlumno(Set<Alumno> itemsAlumno) {
		this.itemsAlumno = itemsAlumno;
	}

	public Horario getItemsHorario() {
		return itemsHorario;
	}

	public void setItemsHorario(Horario itemsHorario) {
		this.itemsHorario = itemsHorario;
	}

	public Curso(Integer cursoId, String curso, Set<Alumno> itemsAlumno, Profesor profesor, Notas nota,
			Horario itemsHorario) {
		this.cursoId = cursoId;
		this.curso = curso;
		this.itemsAlumno = itemsAlumno;
		this.profesor = profesor;
		this.nota = nota;
		this.itemsHorario = itemsHorario;
	}




	
	}
