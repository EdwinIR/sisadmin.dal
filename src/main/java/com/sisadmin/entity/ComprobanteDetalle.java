package com.sisadmin.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ticketlines")
public class ComprobanteDetalle {
	
	private long idSa;
	private String id;
	private String codigo;
	private Comprobante comprobante;
	private UnidadMedida unidadMedida;
	private Producto producto; //product
	private int cantidad; //units
	private BigDecimal precio_unitario;
	private BigDecimal precio_total;
	
	private String usuarioCreacion;
	private String usuarioModificacion;
	private Timestamp fechaCreacion;
	private Timestamp fechaModificacion;
	
	
	@Id
    @Column(name = "id_sa")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getIdSa() {
		return idSa;
	}
	public void setIdSa(long idSa) {
		this.idSa = idSa;
	}	
	@Column(name="ticket")
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}	
	@Column(name="codigo")
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	@ManyToOne
	@JoinColumn(name="comprobante_id")
	public Comprobante getComprobante() {
		return comprobante;
	}
	public void setComprobante(Comprobante comprobante) {
		this.comprobante = comprobante;
	}
	@ManyToOne
	@JoinColumn(name="unidad_medida_id")
	public UnidadMedida getUnidadMedida() {
		return unidadMedida;
	}
	public void setUnidadMedida(UnidadMedida unidadMedida) {
		this.unidadMedida = unidadMedida;
	}
	@ManyToOne
	@JoinColumn(name="producto_id")
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	@Column(name="units")
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	@Column(name="price")
	public BigDecimal getPrecio_unitario() {
		return precio_unitario;
	}
	public void setPrecio_unitario(BigDecimal precio_unitario) {
		this.precio_unitario = precio_unitario;
	}
	@Column(name="precio_total")
	public BigDecimal getPrecio_total() {
		return precio_total;
	}
	public void setPrecio_total(BigDecimal precio_total) {
		this.precio_total = precio_total;
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
	
}
