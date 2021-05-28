package pe.idat.service;

import java.util.Collection;

import pe.idat.entity.Horario;

public interface HorarioService {

	public abstract void insert(Horario horario);
	public abstract Collection<Horario> findAll();
	
}
