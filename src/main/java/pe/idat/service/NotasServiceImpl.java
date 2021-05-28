package pe.idat.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.idat.entity.Notas;
import pe.idat.repository.NotasRepository;

@Service
public class NotasServiceImpl implements NotasService {
	
	@Autowired
	private NotasRepository repository;

	@Override
	@Transactional
	public void insert(Notas notas) {
		repository.save(notas);
	}

	@Override
	@Transactional(readOnly=true)
	public Collection<Notas> findAll() {
		return repository.findAll();
	}
}
