package com.sisadmin.repository;

import org.springframework.data.repository.CrudRepository;

import com.sisadmin.entity.CuentaCobrar;
import com.sisadmin.entity.CuentaCobrarDetalle;

public interface CuentaCobrarDetalleRepository extends CrudRepository<CuentaCobrarDetalle, Long>{

}
