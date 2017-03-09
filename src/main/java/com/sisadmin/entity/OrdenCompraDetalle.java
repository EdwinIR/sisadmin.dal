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
import javax.persistence.Table;
/**
 * Detalle Orden de Compra
 * @author ciro
 *
 */
@Entity
@Table(name="sa_orden_compra_detalle")
public class OrdenCompraDetalle {
	
	/*Campos nativos*/
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column(name="precio_unitario")
	private BigDecimal precioUnitario;
	@Column(name="precio_neto")
	private BigDecimal precioNeto;
	@Column(name="codigo_barra")
	private String codigoBarra;
	@Column(name="bonificado")
	private boolean bonificado;
	@Column(name="descuento1")
	private BigDecimal descuento1;
	@Column(name="descuento2")
	private BigDecimal descuento2;
	@Column(name="descuento3")
	private BigDecimal descuento3;
	@Column(name="descuento4")
	private BigDecimal descuento4;
	@Column(name="valor_bruto")
	private BigDecimal valorBruto;
	@Column(name="total_descuentos")
	private BigDecimal totalDescuentos;
	@Column(name="total_impuestos")
	private BigDecimal totalImpuestos;
	@Column(name="total_compra")
	private BigDecimal totalCompra;
	@Column(name="recepcionado")
	private boolean recepcionado;
	@Column(name="cantidad")
	private BigInteger cantidad;
	
	/*Relaciones*/
	@ManyToOne
	@JoinColumn(name="almacen_id")
	private Almacen almacen;
	
	@ManyToOne
	@JoinColumn(name="producto_id")
	private Producto producto;
	
	@ManyToOne
	@JoinColumn(name="orden_compra_id")
	private OrdenCompra ordenCompra;
	
	@ManyToOne
	@JoinColumn(name="unidad_medida_id")
	private UnidadMedida unidadMedida;
	
	//Auditoría
	@Column(name="usuario_creacion")
	private String usuarioCreacion;
	@Column(name="usuario_modificacion")
	private String usuarioModificacdion;
	@Column(name="fecha_creacion")
	private Timestamp fechaCreacion;
	@Column(name="fecha_modificacion")
	private Timestamp fechaModificacion;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public BigDecimal getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(BigDecimal precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	public BigDecimal getPrecioNeto() {
		return precioNeto;
	}
	public void setPrecioNeto(BigDecimal precioNeto) {
		this.precioNeto = precioNeto;
	}
	public String getCodigoBarra() {
		return codigoBarra;
	}
	public void setCodigoBarra(String codigoBarra) {
		this.codigoBarra = codigoBarra;
	}
	public boolean isBonificado() {
		return bonificado;
	}
	public void setBonificado(boolean bonificado) {
		this.bonificado = bonificado;
	}
	public BigDecimal getDescuento1() {
		return descuento1;
	}
	public void setDescuento1(BigDecimal descuento1) {
		this.descuento1 = descuento1;
	}
	public BigDecimal getDescuento2() {
		return descuento2;
	}
	public void setDescuento2(BigDecimal descuento2) {
		this.descuento2 = descuento2;
	}
	public BigDecimal getDescuento3() {
		return descuento3;
	}
	public void setDescuento3(BigDecimal descuento3) {
		this.descuento3 = descuento3;
	}
	public BigDecimal getDescuento4() {
		return descuento4;
	}
	public void setDescuento4(BigDecimal descuento4) {
		this.descuento4 = descuento4;
	}
	public BigDecimal getValorBruto() {
		return valorBruto;
	}
	public void setValorBruto(BigDecimal valorBruto) {
		this.valorBruto = valorBruto;
	}
	public BigDecimal getTotalDescuentos() {
		return totalDescuentos;
	}
	public void setTotalDescuentos(BigDecimal totalDescuentos) {
		this.totalDescuentos = totalDescuentos;
	}
	public BigDecimal getTotalImpuestos() {
		return totalImpuestos;
	}
	public void setTotalImpuestos(BigDecimal totalImpuestos) {
		this.totalImpuestos = totalImpuestos;
	}
	public BigDecimal getTotalCompra() {
		return totalCompra;
	}
	public void setTotalCompra(BigDecimal totalCompra) {
		this.totalCompra = totalCompra;
	}
	public boolean isRecepcionado() {
		return recepcionado;
	}
	public void setRecepcionado(boolean recepcionado) {
		this.recepcionado = recepcionado;
	}
	public Almacen getAlmacen() {
		return almacen;
	}
	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public OrdenCompra getOrdenCompra() {
		return ordenCompra;
	}
	public void setOrdenCompra(OrdenCompra ordenCompra) {
		this.ordenCompra = ordenCompra;
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
	public BigInteger getCantidad() {
		return cantidad;
	}
	public void setCantidad(BigInteger cantidad) {
		this.cantidad = cantidad;
	}
	public UnidadMedida getUnidadMedida() {
		return unidadMedida;
	}
	public void setUnidadMedida(UnidadMedida unidadMedida) {
		this.unidadMedida = unidadMedida;
	}
}
