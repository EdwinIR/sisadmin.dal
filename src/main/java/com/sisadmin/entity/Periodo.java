package com.sisadmin.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "sa_periodo")
public class Periodo  {
	
	private long id;
	private String codigo;
	private BigDecimal tasaIgv;
	private BigDecimal tasaIsc;
	private BigDecimal tasaIes;
	private BigDecimal mit;
	private String usuarioCreacion;
	private String usuarioModificacion;
	private Timestamp fechaCreacion;
	private Timestamp fechaModificacion;
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name="codigo")
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	@Column(name="tasa_igv")
	public BigDecimal getTasaIgv() {
		return tasaIgv;
	}
	public void setTasaIgv(BigDecimal tasaIgv) {
		this.tasaIgv = tasaIgv;
	}
	
	@Column(name="tasa_isc")
	public BigDecimal getTasaIsc() {
		return tasaIsc;
	}
	public void setTasaIsc(BigDecimal tasaIsc) {
		this.tasaIsc = tasaIsc;
	}
	
	@Column(name="tasa_ies")
	public BigDecimal getTasaIes() {
		return tasaIes;
	}
	public void setTasaIes(BigDecimal tasaIes) {
		this.tasaIes = tasaIes;
	}
	
	@Column(name="mit")
	public BigDecimal getMit() {
		return mit;
	}
	public void setMit(BigDecimal mit) {
		this.mit = mit;
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
	
	
	
}
