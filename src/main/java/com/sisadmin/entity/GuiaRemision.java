package com.sisadmin.entity;

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
@Table(name = "sa_guia_remision")
public class GuiaRemision {

	private long id;
	private Date fechaInicio;
	private String rucDestinatario;
	private String denominacionDestinatario;
	private Almacen almacenOrigen;
	private Almacen almacenDestino;	
	private String numeroGuia; 
	private String nombresTransportista;	
	private String licenciaTransportista; 
	private String marcaTransporte;
	private String placa;
	private TransDeposito transDeposito;
	
	private Collection<GuiaRemisionDetalle> detalles = new ArrayList<GuiaRemisionDetalle>();

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
	@JoinColumn(name = "almacen_origen_id")
	public Almacen getAlmacenOrigen() {
		return almacenOrigen;
	}

	public void setAlmacenOrigen(Almacen almacenOrigen) {
		this.almacenOrigen = almacenOrigen;
	}

	@ManyToOne
	@JoinColumn(name = "almacen_destino_id")
	public Almacen getAlmacenDestino() {
		return almacenDestino;
	}

	public void setAlmacenDestino(Almacen almacenDestino) {
		this.almacenDestino = almacenDestino;
	}

	@Column(name="placa_transporte")
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	@OneToMany(mappedBy="guiaRemision", cascade=CascadeType.ALL)
	public Collection<GuiaRemisionDetalle> getDetalles() {
		return detalles;
	}
	public void setDetalles(Collection<GuiaRemisionDetalle> detalles) {
		this.detalles = detalles;
	}

	@Column(name="ruc_destinatario")
	public String getRucDestinatario() {
		return rucDestinatario;
	}
	public void setRucDestinatario(String rucDestinatario) {
		this.rucDestinatario = rucDestinatario;
	}

	@Column(name="denominacion_destinatario")
	public String getDenominacionDestinatario() {
		return denominacionDestinatario;
	}

	public void setDenominacionDestinatario(String denominacionDestinatario) {
		this.denominacionDestinatario = denominacionDestinatario;
	}
	@Column(name="nro_guia")
	public String getNumeroGuia() {
		return numeroGuia;
	}

	public void setNumeroGuia(String numeroGuia) {
		this.numeroGuia = numeroGuia;
	}

	@Column(name="nombres_transportista")
	public String getNombresTransportista() {
		return nombresTransportista;
	}

	public void setNombresTransportista(String nombresTransportista) {
		this.nombresTransportista = nombresTransportista;
	}

	@Column(name="licencia_transportista")
	public String getLicenciaTransportista() {
		return licenciaTransportista;
	}

	public void setLicenciaTransportista(String licenciaTransportista) {
		this.licenciaTransportista = licenciaTransportista;
	}

	@Column(name="marca_transporte")
	public String getMarcaTransporte() {
		return marcaTransporte;
	}

	public void setMarcaTransporte(String marcaTransporte) {
		this.marcaTransporte = marcaTransporte;
	}

	@Column(name="fecha_inicio")
	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	@ManyToOne
	@JoinColumn(name = "trans_deposito_id")
	public TransDeposito getTransDeposito() {
		return transDeposito;
	}

	public void setTransDeposito(TransDeposito transDeposito) {
		this.transDeposito = transDeposito;
	}
	
	
	
}
