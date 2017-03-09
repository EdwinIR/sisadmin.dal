package com.sisadmin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.sisadmin.entity.Producto;

public interface ProductoRepository extends CrudRepository<Producto, Long> {
		
	public final static String FIND_ID_FAMILIA_MARCA = "SELECT p " + 
            " FROM Producto p" +
            " WHERE p.marcaFamilia.familia.id=:familiaid AND"+
            " p.marcaFamilia.marca.id=:marcaid AND"+
            " p.unidadMedidaPrincipal.id=:unidadmedidaid";
	 
	
	@Query(FIND_ID_FAMILIA_MARCA)
	public List<Producto> findByCodFamiliaMarca(@Param("familiaid") Long familiaid,@Param("marcaid")Long marcaid,@Param("unidadmedidaid")Long unidadmedidaid);	
	
	@Query("SELECT p.codigoEquivalente FROM Producto p WHERE p.id=:id")
	public String findByCodigoBarraProducto(@Param("id") Long id);

	@Query("SELECT p " + 
            " FROM Producto p" +
            " WHERE p.marcaFamilia.familia.idSa=:familiaid AND"+
            " p.marcaFamilia.marca.idSa=:marcaid")
	public List<Producto> findByCodFamiliaMarcas(@Param("familiaid") Long familiaid,@Param("marcaid")Long marcaid);
	
	@Query("SELECT p " + 
            " FROM Producto p" +
            " WHERE p.marcaFamilia.familia.idSa=:familiaid")
	public List<Producto> findByCodFamilia(@Param("familiaid") Long familiaid);
	
	@Query("SELECT p FROM Producto p WHERE p.idSa=:productoid")
	public Producto findByCodProduct(@Param("productoid") Long productoid);
	
	@Query("SELECT p FROM Producto p WHERE p.codigoBarra=:codigo")
	public Producto findByCodigoBarra(@Param("codigo") String codigo);
	
	
	@Query("SELECT p.marcaFamilia.id " + 
            " FROM Producto p" +
            " WHERE p.marcaFamilia.familia.idSa=:familiaid AND"+
            " p.marcaFamilia.marca.idSa=:marcaid")
	public long findByFamiliaMarcas(@Param("familiaid") Long familiaid,@Param("marcaid")Long marcaid);
	
	@Query("SELECT p FROM Producto p order by p.descripcion asc")
	public List<Producto> productosOrdenados();
	
	@Query("SELECT p FROM Producto p WHERE p.codigoBarra=:code")
	public Producto findByCode(@Param("code") String code);
	
}
