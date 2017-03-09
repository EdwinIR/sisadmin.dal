package com.sisadmin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.sisadmin.entity.Almacen;

public interface AlmacenRepository extends CrudRepository<Almacen,Long>{

	@Query("SELECT a FROM Almacen a WHERE a.id not in(:id) order by a.descripcion asc")
	public List<Almacen> filtroAlmacenes(@Param("id") long id);
	
}
