package com.sisadmin.entity;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * Detalle de la {@link Factura} donde se incluye el precio y la cantidad de cada {@link Producto} por {@link Factura} ingresada
 * @author Ciro
 *
 */
@Entity
@Table(name="sa_factura_detalle")
public class FacturaDetalle {

	@Id
	@Column(name ="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@ManyToOne
	@JoinColumn(name="factura_id")
	private Factura factura;
	
	@ManyToOne
	@JoinColumn(name = "producto_id")
	private Producto producto;
	
	@Column(name="cantidad")
	private int cantidad;
	
	@Column(name="precio")
	private BigDecimal precio;
	
	
	//Auditoría
	@Column(name="usuario_creacion")
	private String usuarioCreacion;
	@Column(name="usuario_modificacion")
	private String usuarioModificacdion;
	@Column(name="fecha_creacion")
	private Timestamp fechaCreacion;
	@Column(name="fecha_modificacion")
	private Timestamp fechaModificacion;
	

	//GETTERS Y SETTERS
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Factura getFactura() {
		return factura;
	}
	public void setFactura(Factura factura) {
		this.factura = factura;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	public String getUsuarioCreacion() {
		return usuarioCreacion;
	}
	public void setUsuarioCreacion(String usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}
	public String getUsuarioModificacdion() {
		return usuarioModificacdion;
	}
	public void setUsuarioModificacdion(String usuarioModificacdion) {
		this.usuarioModificacdion = usuarioModificacdion;
	}
	public Timestamp getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Timestamp fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public Timestamp getFechaModificacion() {
		return fechaModificacion;
	}
	public void setFechaModificacion(Timestamp fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

}
