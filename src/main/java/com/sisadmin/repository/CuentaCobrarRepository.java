package com.sisadmin.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.sisadmin.entity.CuentaCobrar;
import com.sisadmin.entity.CuentaPagar;

public interface CuentaCobrarRepository extends CrudRepository<CuentaCobrar, Long>{

	@Query("SELECT c FROM CuentaCobrar c WHERE c.fechaVencimiento BETWEEN :fechaDesde AND :fechaHasta ORDER BY c.fechaVencimiento")
	public List<CuentaCobrar> findFechas(@Param("fechaDesde") Date fechaDesde,@Param("fechaHasta") Date fechaHasta);
	
	@Query("SELECT c FROM CuentaCobrar c WHERE c.cliente.id=:clienteId ORDER BY c.cliente")
	public List<CuentaCobrar> findByClienteId(@Param("clienteId")Long clienteId);
	
	@Query("SELECT c FROM CuentaCobrar c WHERE c.cliente.id=:clienteId AND c.fechaVencimiento BETWEEN :fechaDesde AND :fechaHasta")
	public List<CuentaCobrar> findByClienteFechas(@Param("clienteId")Long clienteId,@Param("fechaDesde") Date fechaDesde,@Param("fechaHasta") Date fechaHasta);
	
}
