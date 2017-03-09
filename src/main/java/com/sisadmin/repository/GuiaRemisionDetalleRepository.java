package com.sisadmin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.sisadmin.entity.GuiaRemisionDetalle;

public interface GuiaRemisionDetalleRepository extends CrudRepository<GuiaRemisionDetalle, Long>{

	@Query("SELECT gr FROM GuiaRemisionDetalle gr WHERE gr.guiaRemision.id = :id ")	
	public List<GuiaRemisionDetalle> findByGuiaId(@Param("id") long id);	
	
	@Query("DELETE FROM GuiaRemisionDetalle WHERE guiaRemision.id = :id")
	public Long deletexId(@Param("id") Long id); 
	
}
