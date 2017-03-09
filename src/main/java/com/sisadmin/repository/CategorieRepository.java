package com.sisadmin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.sisadmin.entity.Categorie;
import com.sisadmin.entity.OrdenCompra;

public interface CategorieRepository extends CrudRepository<Categorie, Long> {
	
	public Categorie findByCodigo(@Param("codigo") String codigo);
	
	@Query("SELECT c FROM Categorie c order by c.name asc")
	public List<Categorie> categoriasOrdenadas();
	
	@Query("SELECT c FROM Categorie c where c.idSa=:id")
	public Categorie findbyId(@Param("id") long id);
}
