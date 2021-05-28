package pe.idat.service;

import java.util.Collection;

import pe.idat.entity.Curso;


public interface CursoService {

	public abstract void insert(Curso curso);
	public abstract Curso findById(Integer cursoId);
	public abstract Collection<Curso> findAll();
	
}
