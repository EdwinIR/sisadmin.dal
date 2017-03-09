package com.sisadmin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


import com.sisadmin.entity.OrdenCompraDetalle;

public interface DetalleOrdenCompraRepository extends CrudRepository<OrdenCompraDetalle, Long>{
	
	@Query("SELECT oc FROM OrdenCompraDetalle oc WHERE oc.ordenCompra.id = :id")
	public List<OrdenCompraDetalle> findByOrdenCompraId(@Param("id")Long id);

}
