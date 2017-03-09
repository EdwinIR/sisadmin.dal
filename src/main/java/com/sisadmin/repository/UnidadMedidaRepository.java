package com.sisadmin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


import com.sisadmin.entity.UnidadMedida;

public interface UnidadMedidaRepository extends CrudRepository<UnidadMedida,Long> {

	public UnidadMedida findByCodigo(@Param("codigo") Integer codigo);
	
	@Query("SELECT u FROM UnidadMedida u order by u.descripcion asc ")
	public List<UnidadMedida> unidadesOrdenadas();
}
