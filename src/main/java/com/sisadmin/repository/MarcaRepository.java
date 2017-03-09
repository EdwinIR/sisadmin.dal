package com.sisadmin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.sisadmin.entity.Marca;
import com.sisadmin.entity.OrdenCompraDetalle;

public interface MarcaRepository extends CrudRepository<Marca, Long> {
	
	
	public Marca findByCodigo(@Param("codigo") String codigo);
	
	@Query("SELECT m FROM Marca m WHERE m.id = :id")
	public Marca findMarcaBycodigo(@Param("id") String id);
	

	
}
