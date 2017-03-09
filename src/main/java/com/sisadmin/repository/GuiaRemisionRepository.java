package com.sisadmin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.sisadmin.entity.GuiaRemision;

public interface GuiaRemisionRepository extends CrudRepository<GuiaRemision, Long>{

	@Query("SELECT gr FROM GuiaRemision gr WHERE gr.transDeposito.id = :id")
	public GuiaRemision findByTransId(@Param("id") long id);
	
}
