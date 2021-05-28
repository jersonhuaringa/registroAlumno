package pe.idat.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="horarios")
public class Horario implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer horariosId;
	
	@Column
	private String dia;
	
	@Column
	private String turno;
	
	@Column
	private String hora;
	
	@OneToMany(mappedBy="itemsHorario")
	private Collection<Curso> itemCurso= new ArrayList<>();
	
	public Horario() {
	}
	
	public Horario(Integer horariosId, String dia, String turno, String hora) {
		this.horariosId = horariosId;
		this.dia = dia;
		this.turno = turno;
		this.hora = hora;
	}
	public Integer getHorariosId() {
		return horariosId;
	}
	public void setHorariosId(Integer horariosId) {
		this.horariosId = horariosId;
	}
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}

	public Collection<Curso> getItemCurso() {
		return itemCurso;
	}

	public void setItemCurso(Collection<Curso> itemCurso) {
		this.itemCurso = itemCurso;
	}

	public Horario(Integer horariosId, String dia, String turno, String hora, Collection<Curso> itemCurso) {
		super();
		this.horariosId = horariosId;
		this.dia = dia;
		this.turno = turno;
		this.hora = hora;
		this.itemCurso = itemCurso;
	}

	
	
	
	}
	
	


