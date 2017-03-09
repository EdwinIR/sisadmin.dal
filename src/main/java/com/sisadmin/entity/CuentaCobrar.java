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

@Entity
@Table(name="sa_cuenta_cobrar")
public class CuentaCobrar {

	private long id;
	private Cliente cliente;
	private BigDecimal total;
	private BigDecimal montoCobrado;
	private Date fechaVencimiento;
	private String estado;
	
	private String usuarioCreacion;
	private String usuarioModificacion;
	private Timestamp fechaCreacion;
	private Timestamp fechaModificacion;
	
	private Collection<CuentaCobrarDetalle> detalleCuentaCobrar = new ArrayList<CuentaCobrarDetalle>();

	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	@ManyToOne
	@JoinColumn(name="cliente_id")
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Column(name="monto_total")
	public BigDecimal getTotal() {
		return total;
	}

	public void setTotal(BigDecimal total) {
		this.total = total;
	}

	@Column(name ="monto_cobrado")
	public BigDecimal getMontoCobrado() {
		return montoCobrado;
	}

	public void setMontoCobrado(BigDecimal montoCobrado) {
		this.montoCobrado = montoCobrado;
	}

	@Column(name="fecha_vencimiento")
	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	
	@Column(name="estado")
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
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
	
	@OneToMany(mappedBy = "cuentaCobrar", cascade = CascadeType.ALL)
	public Collection<CuentaCobrarDetalle> getDetalleCuentaCobrar() {
		return detalleCuentaCobrar;
	}

	public void setDetalleCuentaCobrar(
			Collection<CuentaCobrarDetalle> detalleCuentaCobrar) {
		this.detalleCuentaCobrar = detalleCuentaCobrar;
	}
}
