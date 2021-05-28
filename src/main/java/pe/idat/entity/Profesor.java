package pe.idat.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="profesores")
public class Profesor implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer profesorId;
	
	@Column
	private String nombre;
	
	@Column
	private String apellido;
	
	@Column
	private Integer telefono;
	
	@Column
	private String especialidad;
	
	@Column
	private String direccion;
	
	@OneToOne(mappedBy = "profesor")
	private Curso curso;
	
	public Profesor() {
	}
	
	public Profesor(Integer profesorId, String nombre, String apellido, Integer telefono, String especialidad,
			String direccion) {
		this.profesorId = profesorId;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.especialidad = especialidad;
		this.direccion = direccion;
	}
	
	public Integer getProfesorId() {
		return profesorId;
	}
	public void setProfesorId(Integer profesorId) {
		this.profesorId = profesorId;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Integer getTelefono() {
		return telefono;
	}
	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	
}
