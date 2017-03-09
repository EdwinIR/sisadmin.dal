package com.sisadmin.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="sa_plan_cuenta")
public class PlanCuenta {

	private long id;
	private String codigo;
	private String descripcion;
	private Boolean inventarioActivo;
	private Boolean inventarioPasivo;
	private Boolean naturalezaPerdida;
	private Boolean naturalezaGanancia;
	private Boolean funcionPerdida;
	private Boolean funcionGanancia;
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
	
	@Column(name = "codigo")
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	@Column(name = "descripcion")
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	@Column(name = "inventario_activo")
	public Boolean getInventarioActivo() {
		return inventarioActivo;
	}
	public void setInventarioActivo(Boolean inventarioActivo) {
		this.inventarioActivo = inventarioActivo;
	}
	
	@Column(name = "inventario_pasivo")
	public Boolean getInventarioPasivo() {
		return inventarioPasivo;
	}
	public void setInventarioPasivo(Boolean inventarioPasivo) {
		this.inventarioPasivo = inventarioPasivo;
	}
	
	@Column(name = "naturaleza_perdida")
	public Boolean getNaturalezaPerdida() {
		return naturalezaPerdida;
	}
	public void setNaturalezaPerdida(Boolean naturalezaPerdida) {
		this.naturalezaPerdida = naturalezaPerdida;
	}
	
	@Column(name = "naturaleza_ganancia")
	public Boolean getNaturalezaGanancia() {
		return naturalezaGanancia;
	}
	public void setNaturalezaGanancia(Boolean naturalezaGanancia) {
		this.naturalezaGanancia = naturalezaGanancia;
	}
	
	@Column(name = "funcion_perdida")
	public Boolean getFuncionPerdida() {
		return funcionPerdida;
	}
	public void setFuncionPerdida(Boolean funcionPerdida) {
		this.funcionPerdida = funcionPerdida;
	}
	
	@Column(name = "funcion_ganancia")
	public Boolean getFuncionGanancia() {
		return funcionGanancia;
	}
	public void setFuncionGanancia(Boolean funcionGanancia) {
		this.funcionGanancia = funcionGanancia;
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
