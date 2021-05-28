package pe.idat.service;


import java.util.Collection;


import org.springframework.transaction.annotation.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.idat.entity.Profesor;
import pe.idat.repository.ProfesorRepository;

@Service
public class ProfesorServiceImpl implements ProfesorService {
	
	@Autowired
	private ProfesorRepository repository;

	@Override
	@Transactional
	public void insert(Profesor profesor) {
		repository.save(profesor);
	}

	@Override
	@Transactional(readOnly=true)
	public Collection<Profesor> findAll() {
		return repository.findAll();
	}

}
