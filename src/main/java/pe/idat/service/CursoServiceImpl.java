package pe.idat.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.idat.entity.Curso;
import pe.idat.repository.CursosRepository;

@Service
public class CursoServiceImpl implements CursoService{
	
	@Autowired
	private CursosRepository repository;

	@Override
	@Transactional
	public void insert(Curso curso) {
		repository.save(curso);
	}
	
	@Override
	@Transactional(readOnly=true)
	public Curso findById(Integer cursoId) {
		return repository.findById(cursoId).orElse(null);
	}

	@Override
	@Transactional(readOnly=true)
	public Collection<Curso> findAll() {
		return repository.findAll();
	}

}
