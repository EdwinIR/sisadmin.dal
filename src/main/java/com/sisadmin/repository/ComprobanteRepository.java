package com.sisadmin.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.sisadmin.entity.Comprobante;

public interface ComprobanteRepository extends CrudRepository<Comprobante, Long>{

	@Query("SELECT c FROM Comprobante c WHERE c.nroDocumento like %:nroDocumento%")
	public List<Comprobante> findByNroDocumento(@Param("nroDocumento") String nroDocumento);
	
	@Query("SELECT c FROM Comprobante c WHERE c.vendedor.id = :vendedorId ")
	public List<Comprobante> findByVendedorId(@Param("vendedorId") String vendedorId);
	
	@Query("SELECT c FROM Comprobante c WHERE c.vendedor.id = :vendedorId AND c.nroDocumento = :nroDocumento")
	public List<Comprobante> findByVendedorAndDocumento(@Param("vendedorId") String vendedorId,@Param("nroDocumento") String nroDocumento);	
	
	@Query("SELECT c FROM Comprobante c WHERE c.fechaEmision BETWEEN :fechaDesde AND :fechaHasta")
	public List<Comprobante> findByFechas(@Param("fechaDesde") Date fechaDesde,@Param("fechaHasta") Date fechaHasta);
	
	@Query("SELECT c FROM Comprobante c WHERE c.vendedor.id = :vendedorId And c.fechaEmision BETWEEN :fechaDesde AND :fechaHasta")
	public List<Comprobante> findByFechasAndVendedor(@Param("vendedorId") String vendedorId,@Param("fechaDesde") Date fechaDesde,@Param("fechaHasta") Date fechaHasta);

	@Query("SELECT c FROM Comprobante c WHERE c.nroDocumento like %:nroDocumento% AND c.fechaEmision BETWEEN :fechaDesde AND :fechaHasta")
	public List<Comprobante> findByFechasAndNroDocumento(@Param("nroDocumento") String nroDocumento,@Param("fechaDesde") Date fechaDesde,@Param("fechaHasta") Date fechaHasta);
}
