package com.sisadmin.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "sa_ajuste_inventario")
public class AjusteInventario {

	private long id;
	private String numeroAjuste;
	private Date fecha;
	private Producto producto;
	private UnidadMedida unidadMedida;
	private BigDecimal stockAnterior;
	private BigDecimal stockNuevo;
	private String observaciones;
	
	@Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name="numero_ajuste")
	public String getNumeroAjuste() {
		return numeroAjuste;
	}
	public void setNumeroAjuste(String numeroAjuste) {
		this.numeroAjuste = numeroAjuste;
	}
	
	@Column(name="fecha")
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	@ManyToOne
	@JoinColumn(name="producto_id")
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	
	@ManyToOne
	@JoinColumn(name="unidad_medida_id")
	public UnidadMedida getUnidadMedida() {
		return unidadMedida;
	}
	public void setUnidadMedida(UnidadMedida unidadMedida) {
		this.unidadMedida = unidadMedida;
	}
	
	@Column(name = "stock_anterior")
	public BigDecimal getStockAnterior() {
		return stockAnterior;
	}
	public void setStockAnterior(BigDecimal stockAnterior) {
		this.stockAnterior = stockAnterior;
	}
	
	@Column(name = "stock_nuevo")
	public BigDecimal getStockNuevo() {
		return stockNuevo;
	}
	public void setStockNuevo(BigDecimal stockNuevo) {
		this.stockNuevo = stockNuevo;
	}
	
	@Column(name = "observaciones")
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
	
}
