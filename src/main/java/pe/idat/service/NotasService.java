package pe.idat.service;

import java.util.Collection;

import pe.idat.entity.Notas;
import pe.idat.entity.Profesor;

public interface NotasService {

	public abstract void insert(Notas notas);
	public abstract Collection<Notas> findAll();
}
