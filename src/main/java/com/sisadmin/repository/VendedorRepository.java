package com.sisadmin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.sisadmin.entity.Vendedor;

public interface VendedorRepository extends CrudRepository<Vendedor,String>{
	
	@Query("SELECT v FROM Vendedor v order by v.nombreCompleto asc")
	List<Vendedor>VendedoresOrdenados();

}
