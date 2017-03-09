package com.sisadmin.entity;

import java.math.BigDecimal;
import java.security.Timestamp;
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
@Table(name="sa_cliente_deuda_detalle")
public class ClienteDeudaDetalle {
	
	private long id;
	private ClienteDeuda clienteDeuda;
	private Comprobante comprobante;
	private BigDecimal montoAdeudado;
	private Date fechaVencimiento;
	private String obervaciones;
	
	private String usuarioCreacion;
	private String usuarioModificacion;
	private Timestamp fechaCreacion;
	private Timestamp fechaModificacion;
	
	@Id
	@Column(name ="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	
	@ManyToOne
	@JoinColumn(name = "cliente_deuda_id")
	public ClienteDeuda getClienteDeuda() {
		return clienteDeuda;
	}
	public void setClienteDeuda(ClienteDeuda clienteDeuda) {
		this.clienteDeuda = clienteDeuda;
	}
	
	@ManyToOne
	@JoinColumn(name = "comprobante_id")
	public Comprobante getComprobante() {
		return comprobante;
	}
	public void setComprobante(Comprobante comprobante) {
		this.comprobante = comprobante;
	}
	
	@Column(name="monto_adeudado")
	public BigDecimal getMontoAdeudado() {
		return montoAdeudado;
	}
	public void setMontoAdeudado(BigDecimal montoAdeudado) {
		this.montoAdeudado = montoAdeudado;
	}
	
	@Column(name="fecha_vencimiento")
	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	
	@Column(name="observaciones")
	public String getObervaciones() {
		return obervaciones;
	}
	public void setObervaciones(String obervaciones) {
		this.obervaciones = obervaciones;
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
