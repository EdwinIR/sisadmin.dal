package com.sisadmin.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.sisadmin.entity.AjusteInventario;

public interface AjusteInventarioRepository extends CrudRepository<AjusteInventario,Long>{
	
	@Query("SELECT ai FROM AjusteInventario ai WHERE ai.fecha BETWEEN :fechaDesde AND :fechaHasta")
	public List<AjusteInventario> findFechas(@Param("fechaDesde") Date fechaDesde,@Param("fechaHasta") Date fechaHasta);

	@Query("SELECT ai FROM AjusteInventario ai WHERE ai.producto.marcaFamilia.id=:marcaFamiliaId AND ai.fecha BETWEEN :fechaDesde AND :fechaHasta")
	public List<AjusteInventario> findByMarcaFamiliaFechas(@Param("marcaFamiliaId")Long marcaFamiliaId,@Param("fechaDesde") Date fechaDesde,@Param("fechaHasta") Date fechaHasta);
	
	@Query("SELECT ai FROM AjusteInventario ai WHERE ai.producto.marcaFamilia.id=:marcaFamiliaId")
	public List<AjusteInventario> findByMarcaFamilia(@Param("marcaFamiliaId")Long marcaFamiliaId);
	
	@Query("SELECT ai FROM AjusteInventario ai WHERE ai.producto.marcaFamilia.familia.idSa=:familiaId")
	public List<AjusteInventario> findByFamilia(@Param("familiaId")Long familiaId);
	
}
