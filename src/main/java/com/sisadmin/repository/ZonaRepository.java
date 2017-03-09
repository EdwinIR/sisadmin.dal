package com.sisadmin.repository;

import java.util.List;

import org.jboss.logging.annotations.Property;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


import com.sisadmin.entity.Zona;

public interface ZonaRepository extends CrudRepository<Zona,Long>{
	
	/*Ciro 03102016*/
	//Busca zona por almacenId
	@Query("select z from Zona z where z.almacen.id = :almId")
	List<Zona> findZonaByAlmacenId(@Param("almId")long almacenId);
	
	@Query("SELECT z FROM Zona z order by z.descripcion asc")
	public List<Zona> findAllZona();
}
