package com.sisadmin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.sisadmin.entity.CuentaContable;
import com.sisadmin.entity.RelacionSeisNueve;

public interface CuentaContableRepository extends CrudRepository<CuentaContable, Long>{

	public final static String FIND_ID_TYPE = "SELECT cc " + 
            " FROM CuentaContable cc" +
            " WHERE cc.codigo like :cod_table%";
	
	@Query(FIND_ID_TYPE)
	public List<CuentaContable> findByCodTabla(@Param("cod_table") String cod_table);
	
}
