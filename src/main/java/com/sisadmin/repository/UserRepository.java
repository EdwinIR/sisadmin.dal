package com.sisadmin.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sisadmin.entity.User;
import com.sisadmin.entity.UserPK;


public interface  UserRepository extends CrudRepository<User, UserPK>{

	public User findByRucAndCodUsuarioAndTipoUsuario(String Ruc, String Codusuario, String TipoUsuario);
	
	public User findByRucAndCodUsuario(String Ruc, String Codusuario);
	
	public User findByRucAndCodUsuarioAndRucEmpresa(String Ruc, String Codusuario, String RucEmpresa);
	
	public List<User> findAllByRuc(String Ruc); 
	
	public List<User> findAllBytipoUsuario(String tipoUsuario); 
}
