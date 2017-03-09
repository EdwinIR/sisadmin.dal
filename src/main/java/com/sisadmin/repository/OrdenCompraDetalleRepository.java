package com.sisadmin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.sisadmin.entity.OrdenCompra;
import com.sisadmin.entity.OrdenCompraDetalle;

public interface OrdenCompraDetalleRepository extends CrudRepository<OrdenCompraDetalle, Long>{

	@Query("SELECT o FROM OrdenCompraDetalle o WHERE o.ordenCompra.id=:id")
	public List<OrdenCompraDetalle> ordenDetalleById(@Param("id") long id);
	
	@Query("SELECT ocd FROM OrdenCompraDetalle ocd WHERE ocd.ordenCompra.estado = :estado AND ocd.producto.descripcion = :nombre order by ocd.precioNeto desc")
	public List<OrdenCompraDetalle> listadoIngresados(@Param("estado") String estado,@Param("nombre") String nombre);
	
	
}
