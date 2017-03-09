package com.sisadmin.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.sisadmin.entity.OrdenCompra;

public interface OrdenCompraRepository extends CrudRepository<OrdenCompra, Long>{

	@Query("SELECT c FROM OrdenCompra c WHERE c.estado like %:estadoPendiente%")
	public List<OrdenCompra> ordenesPendientes(@Param("estadoPendiente") String estadoPendiente);
	
	@Query("SELECT oc FROM OrdenCompra oc WHERE oc.estado like %:Ingresada%")
	public List<OrdenCompra> ordenesIngresadas(@Param("Ingresada") String Ingresada);
	
	@Query("SELECT oc FROM OrdenCompra oc WHERE oc.fechaEmision BETWEEN :fechaInicio AND :fechaFin")
	public List<OrdenCompra> ordenesFechas(@Param("fechaInicio") Date fechaInicio,@Param("fechaFin") Date fechaFin);
}
