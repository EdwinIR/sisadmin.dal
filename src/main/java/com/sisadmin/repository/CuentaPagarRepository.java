package com.sisadmin.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.sisadmin.entity.AjusteInventario;
import com.sisadmin.entity.CuentaPagar;

public interface CuentaPagarRepository extends CrudRepository<CuentaPagar, Long> {
	
	@Query("SELECT c FROM CuentaPagar c WHERE c.fechaVencimiento BETWEEN :fechaDesde AND :fechaHasta ORDER BY c.fechaVencimiento")
	public List<CuentaPagar> findFechas(@Param("fechaDesde") Date fechaDesde,@Param("fechaHasta") Date fechaHasta);
	
	@Query("SELECT c FROM CuentaPagar c WHERE c.proveedor.id=:proveedorId ORDER BY c.proveedor")
	public List<CuentaPagar> findByProveedorId(@Param("proveedorId")Long proveedorId);
	
	@Query("SELECT c FROM CuentaPagar c WHERE c.proveedor.id=:proveedorId AND c.fechaVencimiento BETWEEN :fechaDesde AND :fechaHasta")
	public List<CuentaPagar> findByProveedorFechas(@Param("proveedorId")Long proveedorId,@Param("fechaDesde") Date fechaDesde,@Param("fechaHasta") Date fechaHasta);

}
