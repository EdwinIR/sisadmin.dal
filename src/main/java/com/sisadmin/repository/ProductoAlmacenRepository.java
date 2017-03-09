package com.sisadmin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.sisadmin.entity.ProductoAlmacen;

public interface ProductoAlmacenRepository extends CrudRepository<ProductoAlmacen,Long>{
	
	@Query("SELECT pa FROM ProductoAlmacen pa WHERE pa.producto.id = :id")
	public List<ProductoAlmacen> findByCodProducto(@Param("id") Long id);
	
	@Query("SELECT pa.id FROM ProductoAlmacen pa WHERE pa.producto.id = :id")
	public Long findByCodProductID(@Param("id") Long id); 
	
	@Query("SELECT pa FROM ProductoAlmacen pa WHERE pa.producto.idSa = :id and pa.almacen.id = :idAlmacen")
	public ProductoAlmacen findByCodProductoCodAlmacen(@Param("id") Long id,@Param("idAlmacen") Long idAlmacen);
	/*@Query("select pa FROM ProductoAlmacen pa where pa.producto.marcafamilia.familia.id = :idFam and pa.producto.marcafamilia.marca.id = :idMar")
	public List<ProductoAlmacen> findByCodFamiliaCodMarca(@Param("idFam") Long familiaId,@Param("idMar") Long marcaId);
	*/
	
	@Query("SELECT pa FROM ProductoAlmacen pa WHERE pa.producto.idSa = :productoid AND pa.almacen.id = :almacenId")
	public ProductoAlmacen findByCodProduct(@Param("productoid") Long productoid,@Param("almacenId") Long almacenId);
	
	@Query("SELECT pa FROM ProductoAlmacen pa WHERE pa.producto.idSa = :productoid")
	public ProductoAlmacen buscarPorCodigoProducto(@Param("productoid") Long productoid);

}
