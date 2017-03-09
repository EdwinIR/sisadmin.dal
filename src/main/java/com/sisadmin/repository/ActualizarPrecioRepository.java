package com.sisadmin.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.sisadmin.entity.ActualizarPrecio;
import com.sisadmin.entity.OrdenCompra;
import com.sisadmin.entity.OrdenCompraDetalle;

public interface ActualizarPrecioRepository extends CrudRepository<ActualizarPrecio,Long>{

	@Query("SELECT a FROM ActualizarPrecio a WHERE a.producto.descripcion = :nombre AND a.estado like %:pendiente% order by a.precioNuevo desc")
	public List<ActualizarPrecio> listadoIngresados(@Param("nombre") String nombre,@Param("pendiente") String pendiente);
	
	@Query("SELECT a FROM ActualizarPrecio a WHERE a.producto.descripcion = :nombre AND a.fechaIngreso BETWEEN :fechaInicio AND :fechaFin order by a.precioNuevo desc")
	public List<ActualizarPrecio> findByFechas(@Param("nombre") String nombre,@Param("fechaInicio") Date fechaInicio,@Param("fechaFin") Date fechaFin);
	
	@Query("SELECT a FROM ActualizarPrecio a WHERE a.producto.descripcion = :descripcion ")
	public List<ActualizarPrecio> findByProduct(@Param("descripcion") String descripcion);
	
}
