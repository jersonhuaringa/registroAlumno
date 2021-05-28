package pe.idat.service;

import java.util.Collection;

import pe.idat.entity.Profesor;

public interface ProfesorService {

	public abstract void insert(Profesor profesor);
	public abstract Collection<Profesor> findAll();
	
	
}
