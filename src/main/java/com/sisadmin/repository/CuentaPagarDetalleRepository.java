package com.sisadmin.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.sisadmin.entity.CuentaPagarDetalle;

public interface CuentaPagarDetalleRepository extends CrudRepository<CuentaPagarDetalle, Long>{
	
	@Query("DELETE FROM CuentaPagarDetalle WHERE cuentaPagar.id = :id")
	public Long deleteXidCuentaPagar(@Param("id") Long id); 

}
