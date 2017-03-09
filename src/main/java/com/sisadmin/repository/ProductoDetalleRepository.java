package com.sisadmin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.sisadmin.entity.ProductoAlmacen;
import com.sisadmin.entity.ProductoDetalle;

public interface ProductoDetalleRepository extends CrudRepository<ProductoDetalle, Long>{
	
	@Query("SELECT pa FROM ProductoDetalle pa WHERE pa.producto.idSa = :id")
	public List<ProductoDetalle> findByCodProducto(@Param("id") Long id);
	
	@Query("SELECT pa FROM ProductoDetalle pa WHERE pa.producto.idSa = :id AND pa.unidadMedida.codigo = :codigo")
	public ProductoDetalle findByCodProductoAndUnidadMedida(@Param("id") Long id,@Param("codigo") int codigo);
	
	@Query("SELECT pa FROM ProductoDetalle pa WHERE pa.id = :id ")
	public ProductoDetalle findByProductId(@Param("id") Long id);

}
