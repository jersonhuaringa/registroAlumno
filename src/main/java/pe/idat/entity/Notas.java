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
@Table(name="notas")
public class Notas implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer notaId;
	
	@Column
	private Integer eContinua1;
	
	@Column
	private Integer eContinua2;
	
	@Column
	private Integer eContinua3;
	
	@Column
	private Integer eFinal;
	
	@Column
	private String estado;
	
	@Column
	private Integer promedio;
	
	public Notas() {
	}
	
	@OneToOne(mappedBy = "nota")
	private Curso curso;
	
	public Notas(Integer notaId, Integer eContinua1, Integer eContinua2, Integer eContinua3, Integer eFinal,
			String estado, Integer promedio) {
		this.notaId = notaId;
		this.eContinua1 = eContinua1;
		this.eContinua2 = eContinua2;
		this.eContinua3 = eContinua3;
		this.eFinal = eFinal;
		this.estado = estado;
		this.promedio = promedio;
	}
	
	public Integer getNotaId() {
		return notaId;
	}
	public void setNotaId(Integer notaId) {
		this.notaId = notaId;
	}
	public Integer geteContinua1() {
		return eContinua1;
	}
	public void seteContinua1(Integer eContinua1) {
		this.eContinua1 = eContinua1;
	}
	public Integer geteContinua2() {
		return eContinua2;
	}
	public void seteContinua2(Integer eContinua2) {
		this.eContinua2 = eContinua2;
	}
	public Integer geteContinua3() {
		return eContinua3;
	}
	public void seteContinua3(Integer eContinua3) {
		this.eContinua3 = eContinua3;
	}
	public Integer geteFinal() {
		return eFinal;
	}
	public void seteFinal(Integer eFinal) {
		this.eFinal = eFinal;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Integer getPromedio() {
		return promedio;
	}
	public void setPromedio(Integer promedio) {
		this.promedio = promedio;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	
	
}
