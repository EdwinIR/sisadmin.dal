package com.sisadmin.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "sa_producto_almacen")
public class ProductoAlmacen {

	private long id;
	private Producto producto;
	private Almacen almacen;		
	private BigDecimal cantidad;
	
	/*Auditoria*/
	private String usuarioCreacion;
	private String usuarioModificacion;
	private Timestamp fechaCreacion;
	private Timestamp fechaModificacion;
	
	private BigDecimal stockMinimo;
	private BigDecimal stockMaximo;
	
	@Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}	

	@ManyToOne
	@JoinColumn(name="producto_id")	
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}	
	
	
	
	@Column(name="cantidad")
	public BigDecimal getCantidad() {
		return cantidad;
	}
	public void setCantidad(BigDecimal cantidad) {
		this.cantidad = cantidad;
	}
	
	@Column(name="usuario_creacion")
	public String getUsuarioCreacion() {
		return usuarioCreacion;
	}
	public void setUsuarioCreacion(String usuarioCreacion) {
		this.usuarioCreacion = usuarioCreacion;
	}
	
	@Column(name="usuario_modificacion")
	public String getUsuarioModificacion() {
		return usuarioModificacion;
	}
	public void setUsuarioModificacion(String usuarioModificacion) {
		this.usuarioModificacion = usuarioModificacion;
	}
	
	@Column(name="fecha_creacion")
	public Timestamp getFechaCreacion() {
		return fechaCreacion;
	}	
	
	public void setFechaCreacion(Timestamp fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	
	@Column(name="fecha_modificacion")
	public Timestamp getFechaModificacion() {
		return fechaModificacion;
	}
	public void setFechaModificacion(Timestamp fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}
	@Column(name="stock_min")
	public BigDecimal getStockMinimo() {
		return stockMinimo;
	}
	public void setStockMinimo(BigDecimal stockMinimo) {
		this.stockMinimo = stockMinimo;
	}
	@Column(name="stock_max")
	public BigDecimal getStockMaximo() {
		return stockMaximo;
	}
	public void setStockMaximo(BigDecimal stockMaximo) {
		this.stockMaximo = stockMaximo;
	}
	@ManyToOne
	@JoinColumn(name="almacen_id")		
	public Almacen getAlmacen() {
		return almacen;
	}
	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}
	
	
	

}


/**
private UnidadMedida unidadMedida;
private Marca marca;
private Familia familia;
private BigDecimal precio;
**/
/**
@ManyToOne
@JoinColumn(name="unidad_medida_id")
public UnidadMedida getUnidadMedida() {
	return unidadMedida;
}
public void setUnidadMedida(UnidadMedida unidadMedida) {
	this.unidadMedida = unidadMedida;
}

@ManyToOne
@JoinColumn(name="marca_id")
public Marca getMarca() {
	return marca;
}
public void setMarca(Marca marca) {
	this.marca = marca;
}

@ManyToOne
@JoinColumn(name="familia_id")
public Familia getFamilia() {
	return familia;
}
public void setFamilia(Familia familia) {
	this.familia = familia;
}

@Column(name="precio")
public BigDecimal getPrecio() {
	return precio;
}
public void setPrecio(BigDecimal precio) {
	this.precio = precio;
}**/