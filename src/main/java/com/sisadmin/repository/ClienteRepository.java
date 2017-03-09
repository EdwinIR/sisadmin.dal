package com.sisadmin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.sisadmin.entity.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, String>{
	
	public Cliente findByTipoDocumento(@Param("tipoDocumento") String tipoDocumento);
	
	public Cliente findByEmail(@Param("email") String email);
	
	public Cliente findByRazonSocial(@Param("razonSocial") String razonSocial);
	
	@Query("SELECT c FROM Cliente c WHERE c.region = :region")
	public List<Cliente> findByRegion(@Param("region") String region);
	

}
