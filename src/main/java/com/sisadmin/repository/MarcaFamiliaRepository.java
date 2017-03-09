package com.sisadmin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.sisadmin.entity.MarcaFamilia;

public interface MarcaFamiliaRepository extends CrudRepository<MarcaFamilia,Long>{
	
	/*Ciro 02102016*/
	@Query("select mf from MarcaFamilia mf where mf.marca.idSa = :idMar and mf.familia.idSa = :idFam")
	MarcaFamilia findByIdMarcaAndIdFamilia(@Param("idMar")long idMarca, @Param("idFam")long idFamilia);
	
	@Query("select mf from MarcaFamilia mf where mf.familia.idSa = :idFam and mf.marca.idSa = :idMar")
	List<MarcaFamilia> findByFamiliaAndMarca(@Param("idFam")long idFamilia,@Param("idMar")long idMarca);

	@Query("select m from MarcaFamilia m where m.familia.idSa = :idFam")
	List<MarcaFamilia> findByFamiliaId(@Param("idFam")long idFam);
	
}
