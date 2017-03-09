package com.sisadmin.entity;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "sa_almacen")
public class Almacen {

	
	private long id;
	//private String codigo;
	private String descripcion;
	private String direccion;
	private String telefono;
	private String usuarioCreacion;
	private String usuarioModificacion;
	private Timestamp fechaCreacion;
	private Timestamp fechaModificacion;	
	private Collection<Zona> zonas = new ArrayList<Zona>();
	
	//private Collection<ProductoAlmacen> productoAlmacen = new ArrayList<ProductoAlmacen>();
	
	
	@Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	/*@Column(name = "codigo")
	public String getCodigo() {
		return codigo;
	
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}*/
	
	@Column(name = "descripcion")
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	/**
	@OneToMany(mappedBy = "pk.almacen", cascade=CascadeType.ALL)
	public Collection<ProductoAlmacen> getProductoAlmacen() {
		return productoAlmacen;
	}
	public void setProductoAlmacen(Collection<ProductoAlmacen> productoAlmacen) {
		this.productoAlmacen = productoAlmacen;
	}**/
	
	@Column(name = "usuario_creacion")
	public String getUsuarioCreacion() {
		return usuarioCreacion;
	}
	public void setUsuarioCreacion(String usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}
	
	@Column(name = "usuario_modificacion")
	public String getUsuarioModificacion() {
		return usuarioModificacion;
	}
	public void setUsuarioModificacion(String usuarioModificacion) {
		this.usuarioModificacion = usuarioModificacion;
	}
	
	@Column(name = "fecha_creacion")
	public Timestamp getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Timestamp fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	
	@Column(name = "fecha_modificacion")
	public Timestamp getFechaModificacion() {
		return fechaModificacion;
	}
	public void setFechaModificacion(Timestamp fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}
	
	@OneToMany(mappedBy="almacen", cascade=CascadeType.ALL)
	public Collection<Zona> getZonas() {
		return zonas;
	}
	public void setZonas(Collection<Zona> zonas) {
		this.zonas = zonas;
	}
	
	@Column(name = "direccion")
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	@Column(name = "telefono")
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	
}
