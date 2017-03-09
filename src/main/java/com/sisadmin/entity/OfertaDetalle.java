package com.sisadmin.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="sa_oferta_detalle")
public class OfertaDetalle {
	
	
	private Long id;
	private Producto producto;
	private Oferta oferta;
	private BigDecimal precioA;
	private BigDecimal precioB;
	private BigDecimal precioC;
	
	private BigDecimal precioOfertaA;
	private BigDecimal precioOfertaB;
	private BigDecimal precioOfertaC;
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
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
	
	@Column(name = "precio_a")
	public BigDecimal getPrecioA() {
		return precioA;
	}	
	public void setPrecioA(BigDecimal precioA) {
		this.precioA = precioA;
	}
	
	@Column(name = "precio_b")
	public BigDecimal getPrecioB() {
		return precioB;
	}
	public void setPrecioB(BigDecimal precioB) {
		this.precioB = precioB;
	}
	
	@Column(name = "precio_c")
	public BigDecimal getPrecioC() {
		return precioC;
	}
	public void setPrecioC(BigDecimal precioC) {
		this.precioC = precioC;
	}
	
	@Column(name = "precio_oferta_a")
	public BigDecimal getPrecioOfertaA() {
		return precioOfertaA;
	}
	public void setPrecioOfertaA(BigDecimal precioOfertaA) {
		this.precioOfertaA = precioOfertaA;
	}
	
	
	@Column(name = "precio_oferta_b")
	public BigDecimal getPrecioOfertaB() {
		return precioOfertaB;
	}
	public void setPrecioOfertaB(BigDecimal precioOfertaB) {
		this.precioOfertaB = precioOfertaB;
	}
	
	
	@Column(name = "precio_oferta_c")
	public BigDecimal getPrecioOfertaC() {
		return precioOfertaC;
	}
	public void setPrecioOfertaC(BigDecimal precioOfertaC) {
		this.precioOfertaC = precioOfertaC;
	}
	
	
	@ManyToOne
	@JoinColumn(name="oferta_id")
	public Oferta getOferta() {
		return oferta;
	}
	public void setOferta(Oferta oferta) {
		this.oferta = oferta;
	}


}
