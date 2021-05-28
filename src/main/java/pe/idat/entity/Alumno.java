package pe.idat.entity;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="alumnos")
public class Alumno implements Serializable{
	
	private static final long serialVersionUID=1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer schoolId;
	
	@Column
	private String nombre;
	
	@Column
	private String apellido;
	
	@Column
	private String sexo;
	
	@Column
	private String codAlumno;
	
	@Column
	private Integer telefono;
	
	@Column
	private String direccion;
	
	public Alumno(){	
	}
	
	@ManyToMany(mappedBy="itemsAlumno")
	private Set<Curso> itemCurso = new HashSet<>();
	


	public Alumno(Integer schoolId, String nombre, String apellido, String sexo, String codAlumno, Integer telefono,
			String direccion) {
		this.schoolId = schoolId;
		this.nombre = nombre;
		this.apellido = apellido;
		this.sexo = sexo;
		this.codAlumno = codAlumno;
		this.telefono = telefono;
		this.direccion = direccion;
	}

	

	public Integer getSchoolId() {
		return schoolId;
	}

	public void setSchoolId(Integer schoolId) {
		this.schoolId = schoolId;
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

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCodAlumno() {
		return codAlumno;
	}

	public void setCodAlumno(String codAlumno) {
		this.codAlumno = codAlumno;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Set<Curso> getItemCurso() {
		return itemCurso;
	}

	public void setItemCurso(Set<Curso> itemCurso) {
		this.itemCurso = itemCurso;
	}
	
}
