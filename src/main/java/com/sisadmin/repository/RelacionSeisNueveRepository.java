package com.sisadmin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.sisadmin.entity.RelacionSeisNueve;
import com.sisadmin.entity.TablaGeneral;

public interface RelacionSeisNueveRepository extends CrudRepository<RelacionSeisNueve,Long>{
		
	
	
}
