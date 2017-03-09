package com.sisadmin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.sisadmin.entity.CuentaContable;
import com.sisadmin.entity.CuentaDivisionaria;

public interface CuentaDivisionariaRepository extends CrudRepository<CuentaDivisionaria,Long>{

	public final static String FIND_ID_TYPE = "SELECT cd " + 
            " FROM CuentaDivisionaria cd" +
            " WHERE cd.codigo like :cod_table%";
	
	@Query(FIND_ID_TYPE)
	public List<CuentaDivisionaria> findByCodTabla(@Param("cod_table") String cod_table);
	
}
