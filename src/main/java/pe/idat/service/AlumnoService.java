package pe.idat.service;


import java.util.Collection;

import pe.idat.entity.Alumno;

public interface AlumnoService {
	public abstract void insert(Alumno alumno);
	public abstract void update(Alumno alumno);
	public abstract void delete(Integer alumnoId);
	public abstract Alumno findById(Integer alumnoId);
	public abstract Collection<Alumno> findAll();
	
	public abstract Alumno findByNombre(String nombre);
}
