package com.sisadmin.entity;

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
@Table(name="sa_relacion_979")
public class Relacion979 {

	private long id;
	private CuentaDivisionaria cuentaDivisionaria9;
	private CuentaContable cuentaContable79;
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
	
	@ManyToOne
	@JoinColumn(name="cuenta_divisionaria_9")
	public CuentaDivisionaria getCuentaDivisionaria9() {
		return cuentaDivisionaria9;
	}
	public void setCuentaDivisionaria9(CuentaDivisionaria cuentaDivisionaria9) {
		this.cuentaDivisionaria9 = cuentaDivisionaria9;
	}
	
	@ManyToOne
	@JoinColumn(name="cuenta_contable_79")
	public CuentaContable getCuentaContable79() {
		return cuentaContable79;
	}
	public void setCuentaContable79(CuentaContable cuentaContable79) {
		this.cuentaContable79 = cuentaContable79;
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
