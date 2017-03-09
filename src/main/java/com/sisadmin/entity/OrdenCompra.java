package com.sisadmin.entity;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "sa_orden_compra")
public class OrdenCompra {
	private long id;
	private String codigo;
	private Proveedor proveedor;
	private Date fechaEmision;
	private Date fechaRecepcion;
	private Almacen almacen;	
	private CondicionPago condicionPago;
	private Moneda tipoMoneda;
	private String estado;
	
	private String usuarioCreacion;
	private String usuarioModificacion;
	private Timestamp fechaCreacion;
	private Timestamp fechaModificacion;
	
	private Collection<OrdenCompraDetalle> detalleOrdenCompras =new  ArrayList<OrdenCompraDetalle>();
	
	
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
	
	@ManyToOne
	@JoinColumn(name = "proveedor_id")
	public Proveedor getProveedor() {
		return proveedor;
	}
	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
	
	@Column(name="fecha_emision")
	public Date getFechaEmision() {
		return fechaEmision;
	}
	public void setFechaEmision(Date fechaEmision) {
		this.fechaEmision = fechaEmision;
	}
	
	@Column(name="fecha_recepcion")
	public Date getFechaRecepcion() {
		return fechaRecepcion;
	}
	public void setFechaRecepcion(Date fechaRecepcion) {
		this.fechaRecepcion = fechaRecepcion;
	}
	
	@ManyToOne
	@JoinColumn(name = "almacen_id")
	public Almacen getAlmacen() {
		return almacen;
	}
	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}
	
	@ManyToOne
	@JoinColumn(name = "condicion_pago_codigo")
	public CondicionPago getCondicionPago() {
		return condicionPago;
	}
	public void setCondicionPago(CondicionPago condicionPago) {
		this.condicionPago = condicionPago;
	}
	
	@ManyToOne
	@JoinColumn(name = "tipo_moneda_codigo")
	public Moneda getTipoMoneda() {
		return tipoMoneda;
	}
	public void setTipoMoneda(Moneda tipoMoneda) {
		this.tipoMoneda = tipoMoneda;
	}
	
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
	
	@OneToMany(mappedBy="ordenCompra", cascade=CascadeType.ALL)
	public Collection<OrdenCompraDetalle> getDetalleOrdenCompras() {
		return detalleOrdenCompras;
	}
	public void setDetalleOrdenCompras(
			Collection<OrdenCompraDetalle> detalleOrdenCompras) {
		this.detalleOrdenCompras = detalleOrdenCompras;
	}
	
	@Column(name = "estado")
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
	
	
	
	
	
	
	
	
}
