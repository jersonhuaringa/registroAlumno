package pe.idat.service;

import java.util.Collection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.idat.entity.Alumno;
import pe.idat.repository.AlumnoRepository;

@Service
public class AlumnoServiceImpl implements AlumnoService{
	
	@Autowired
	private AlumnoRepository repository;

	@Override
	@Transactional
	public void insert(Alumno alumno) {
		repository.save(alumno);
	}

	@Override
	@Transactional
	public void update(Alumno alumno) {
		repository.save(alumno);
	}

	@Override
	@Transactional
	public void delete(Integer alumnoId) {
		repository.deleteById(alumnoId);	
	}

	@Override 
	@Transactional(readOnly=true)
	public Alumno findById(Integer alumnoId) {
		return repository.findById(alumnoId).orElse(null);
	}

	@Override
	@Transactional(readOnly=true)
	public Collection<Alumno> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public Alumno findByNombre(String nombre) {
		// TODO Auto-generated method stub
		return repository.findByNombre(nombre);
	}
}
