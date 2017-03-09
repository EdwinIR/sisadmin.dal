package com.sisadmin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.sisadmin.entity.ComprobanteDetalle;

public interface ComprobanteDetalleRepository extends CrudRepository<ComprobanteDetalle, Long>{
	
	@Query("SELECT cd FROM ComprobanteDetalle cd WHERE cd.id = :ticketId")
	public List<ComprobanteDetalle> findByTicket(@Param("ticketId")String ticketId);
	
}
