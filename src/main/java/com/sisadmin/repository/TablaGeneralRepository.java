package com.sisadmin.repository;

import java.util.List;

import com.sisadmin.entity.TablaGeneral;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface TablaGeneralRepository extends CrudRepository<TablaGeneral, Long>{
	
	public TablaGeneral findById(@Param ("id") Long id);
	
	public TablaGeneral findByCodigo(@Param ("codigo") String codigo);
	

	public final static String FIND_ID_TYPE = "SELECT gen " + 
            " FROM TablaGeneral gen" +
            " WHERE gen.codigo = :cod_table";
	
	@Query(FIND_ID_TYPE)
	public List<TablaGeneral> findByCodTabla(@Param("cod_table") String cod_table);

}
