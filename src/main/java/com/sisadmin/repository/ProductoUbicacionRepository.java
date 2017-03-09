package com.sisadmin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


import com.sisadmin.entity.ProductoUbicacion;

public interface ProductoUbicacionRepository extends CrudRepository<ProductoUbicacion, Long>{
	
	@Query("SELECT pu FROM ProductoUbicacion pu WHERE pu.producto.idSa = :idSa AND pu.ubicacion.id = :id ")
	public ProductoUbicacion findByUbicacionId(@Param("idSa") long idSa,@Param("id") long id);

}
