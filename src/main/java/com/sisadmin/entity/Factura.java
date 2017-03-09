package com.sisadmin.entity;

import java.math.BigDecimal;
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

import org.hibernate.annotations.Cascade;

@Entity
@Table(name = "sa_factura")
public class Factura {

	 
	   private long id;
	   private String numeroInterno;
	   private Date fechaRegistro;
	   private Date fechaEmision;
	   private Date fechaVencimiento;
	   private TipoDocumento tipoDocumento;
	   private String serie;
	   private String numeracion;
	   private Moneda tipoMoneda;	   
	   private String glosa;
	   private BigDecimal otrosCargos;
	   private BigDecimal baseImponible;
	   private BigDecimal tasaIgv;
	   private BigDecimal igv;
	   private BigDecimal total;
	   private Proveedor proveedor;
	   private BigDecimal cambio;
	    
	   private String usuarioCreacion;
	   private String usuarioModificacion;
	   private Timestamp fechaCreacion;
	   private Timestamp fechaModificacion;
	   
	   
	   private Collection<FacturaDetalle> detalleFacturaProductos = new ArrayList<FacturaDetalle>();
	  
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name="numero_interno")
	public String getNumeroInterno() {
		return numeroInterno;
	}
	public void setNumeroInterno(String numeroInterno) {
		this.numeroInterno = numeroInterno;
	}
	
	@Column(name="fecha_registro")
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	
	@Column(name="fecha_emision")
	public Date getFechaEmision() {
		return fechaEmision;
	}
	public void setFechaEmision(Date fechaEmision) {
		this.fechaEmision = fechaEmision;
	}
	
	@Column(name="fecha_vencimiento")
	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	
	
	@ManyToOne
	@JoinColumn(name = "proveedor_id")
	public Proveedor getProveedor() {
		return proveedor;
	}
	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
	@Column(name="serie")
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	
	@Column(name="numeracion")
	public String getNumeracion() {
		return numeracion;
	}
	public void setNumeracion(String numeracion) {
		this.numeracion = numeracion;	}

	@Column(name="glosa")
	public String getGlosa() {
		return glosa;
	}
	public void setGlosa(String glosa) {
		this.glosa = glosa;
	}
	
	@Column(name="otros_cargos")
	public BigDecimal getOtrosCargos() {
		return otrosCargos;
	}
	public void setOtrosCargos(BigDecimal otrosCargos) {
		this.otrosCargos = otrosCargos;
	}
	
	@Column(name="base_imponible")
	public BigDecimal getBaseImponible() {
		return baseImponible;
	}
	public void setBaseImponible(BigDecimal baseImponible) {
		this.baseImponible = baseImponible;
	}
	
	@Column(name="tasa_igv")
	public BigDecimal getTasaIgv() {
		return tasaIgv;
	}
	public void setTasaIgv(BigDecimal tasaIgv) {
		this.tasaIgv = tasaIgv;
	}
	
	@Column(name="igv")
	public BigDecimal getIgv() {
		return igv;
	}
	public void setIgv(BigDecimal igv) {
		this.igv = igv;
	}
	
	@Column(name="total")
	public BigDecimal getTotal() {
		return total;
	}
	public void setTotal(BigDecimal total) {
		this.total = total;
	}
	
	@ManyToOne
	@JoinColumn(name = "tipo_documento_codigo")
	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
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
	
	//detalleFactura
	@OneToMany(mappedBy="factura", cascade=CascadeType.ALL)
	public Collection<FacturaDetalle> getDetalleFacturaProductos() {
		return detalleFacturaProductos;
	}
	public void setDetalleFacturaProductos(
			Collection<FacturaDetalle> detalleFacturaProductos) {
		this.detalleFacturaProductos = detalleFacturaProductos;
	}
	
	//Cambio
	@Column(name="cambio")
	public BigDecimal getCambio() {
		return cambio;
	}
	public void setCambio(BigDecimal cambio) {
		this.cambio = cambio;
	}
	
	
}
