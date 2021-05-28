package pe.idat.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.idat.entity.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno,Integer> {
	public abstract Alumno findByNombre(String name);
	
	/*
	 * consulta nativa query
	 * @Query(value="select * from school where nombre=?1",nativeQuery=true)
	 * public abstract Producto findByNombre(String nombre);
	 * 
	 *  consulta nativa query
	 * @Query(value="select * from school where nombre=?1",nativeQuery=true)
	 * public abstract Producto findByNombre(@Param("name")String nombre);
	 * 
	 * consulta jpa
	 * @Query("selec p from School p where p.nombre=:name")
	 * public abstact Producto findByNombre(@Param("name")String nombre);
	 */
}
