package com.sisadmin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.sisadmin.entity.Proveedor;

public interface ProveedorRepository extends CrudRepository<Proveedor,Long>{
	
	public final static String BUSCAR="SELECT prov FROM Proveedor prov"+
								" WHERE prov.ruc = :ruc AND"+
								" prov.razonSocial = :razonSocial"	;
	
	@Query(BUSCAR)
	public Proveedor buscarProveedor(@Param ("ruc") String ruc ,@Param ("razonSocial") String razonSocial);

	public Proveedor findByRuc(@Param ("ruc") String ruc);
	
	public Proveedor findByRazonSocial(@Param ("razonSocial") String razonSocial);
	
	@Query("SELECT p FROM Proveedor p WHERE p.ciudad = :ciudad")
	public List<Proveedor> findByCiudad(@Param("ciudad") String ciudad);
	
	@Query("SELECT p FROM Proveedor p order by p.razonSocial asc ")
	public List<Proveedor> proveedoresOrdenados();
	
	
}
