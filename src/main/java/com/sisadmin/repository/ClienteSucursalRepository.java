package com.sisadmin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.sisadmin.entity.ClienteSucursal;

public interface ClienteSucursalRepository extends CrudRepository<ClienteSucursal, Long>{

	
	@Query("select cs from ClienteSucursal cs where cs.cliente.idSa = :clienteId")
	List<ClienteSucursal> findClienteSucursalByClienteId(@Param("clienteId")long clienteId);
}
