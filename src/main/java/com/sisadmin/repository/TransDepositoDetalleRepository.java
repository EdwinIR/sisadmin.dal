package com.sisadmin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


import com.sisadmin.entity.TransDepositoDetalle;

public interface TransDepositoDetalleRepository extends CrudRepository<TransDepositoDetalle, Long>{

	@Query("SELECT td FROM TransDepositoDetalle td WHERE td.transDeposito.id = :id")
	public List<TransDepositoDetalle> findTransDetalleById(@Param("id")Long id);
	
}
