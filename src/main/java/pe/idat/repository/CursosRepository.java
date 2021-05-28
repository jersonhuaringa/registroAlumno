package pe.idat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.idat.entity.Curso;


public interface CursosRepository extends JpaRepository<Curso, Integer> {

}
