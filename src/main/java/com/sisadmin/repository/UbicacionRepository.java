package com.sisadmin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.sisadmin.entity.Ubicacion;

public interface UbicacionRepository extends CrudRepository<Ubicacion,Long> {
	
	/*Ciro 03102016*/
	/**@Query("select u from Ubicacion u where u.almacen.id = :almId and u.zona.id = :zonId")
	List<Ubicacion> findUbicacionByAlmacenIdAndZonaId(@Param("almId")long almacenId, @Param("zonId")long zonaId);
	**/
	
	@Query("select u from Ubicacion u where u.zona.id = :zonId")
	List<Ubicacion> findUbicacionByZonaId(@Param("zonId")long zonaId);
	
	@Query("select u from Ubicacion u where u.zona.almacen.id = :almacenId")
	List<Ubicacion> findUbicacionByAlmacenId(@Param("almacenId")long almacenId);

}