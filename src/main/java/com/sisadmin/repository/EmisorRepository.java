package com.sisadmin.repository;

import org.springframework.data.repository.CrudRepository;

import com.sisadmin.entity.Emisor;




public interface EmisorRepository extends CrudRepository<Emisor, Long>{
	
	public Emisor findOneByRuc(String ruc);

}
