package com.sisadmin.repository;

import org.springframework.data.repository.CrudRepository;

import com.sisadmin.entity.UserRole;
import com.sisadmin.entity.UserRolePK;


public interface UserRoleRepository extends CrudRepository<UserRole, UserRolePK>{

	public UserRole findByRucAndCodUsuarioAndIsActive(String ruc, String codigo, String active);
	
	public UserRole findByRucAndCodUsuario(String ruc, String codigo);
	
}
