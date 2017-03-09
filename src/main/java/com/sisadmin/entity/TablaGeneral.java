package com.sisadmin.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "sa_tabla_general")
public class TablaGeneral {


private long id;
private String codigo;
private String valor;
private String descripcion;
private Boolean activo;


@Id
@Column(name = "id")
@GeneratedValue(strategy = GenerationType.IDENTITY)
public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

@Column(name = "codigo")
public String getCodigo() {
	return codigo;
}

public void setCodigo(String codigo) {
	this.codigo = codigo;
}

@Column(name = "valor")
public String getValor() {
	return valor;
}

public void setValor(String valor) {
	this.valor = valor;
}

@Column(name = "descripcion")
public String getDescripcion() {
	return descripcion;
}

public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}

@Column(name = "activo")
public Boolean getActivo() {
	return activo;
}

public void setActivo(Boolean activo) {
	this.activo = activo;
}

}
