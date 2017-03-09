package com.sisadmin.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "sa_marca_familia")
public class MarcaFamilia {
	
	
	private long id;
	private Marca marca;
	private Categorie familia;
	
	private BigDecimal margenBase;
	private BigDecimal margenA;
	private BigDecimal margenB;
	private BigDecimal margenC;
	private String usuarioCreacion;
	private String usuarioModificacion;
	private Timestamp fechaCreacion;
	private Timestamp fechaModificacion;
	private String marcfam;
	
	
	
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
	@JoinColumn(name="marca_id")
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	@ManyToOne
	@JoinColumn(name="familia_id")
	public Categorie getFamilia() {
		return familia;
	}
	public void setFamilia(Categorie familia) {
		this.familia = familia;
	}

	
	
	
	
	
	
	/**
	@EmbeddedId
	public MarcaFamiliaId getPk() {
		return pk;
	}
	public void setPk(MarcaFamiliaId pk) {
		this.pk = pk;
	}
	**/
	@Column(name="margen_base")
	public BigDecimal getMargenBase() {
		return margenBase;
	}
	public void setMargenBase(BigDecimal margenBase) {
		this.margenBase = margenBase;
	}
	
	@Column(name="margen_a")
	public BigDecimal getMargenA() {
		return margenA;
	}
	public void setMargenA(BigDecimal margenA) {
		this.margenA = margenA;
	}
	
	@Column(name="margen_b")
	public BigDecimal getMargenB() {
		return margenB;
	}
	public void setMargenB(BigDecimal margenB) {
		this.margenB = margenB;
	}
	
	@Column(name="margen_c")
	public BigDecimal getMargenC() {
		return margenC;
	}
	public void setMargenC(BigDecimal margenC) {
		this.margenC = margenC;
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
	@Column(name = "marcfam")
	public String getMarcfam() {
		return marcfam;
	}
	public void setMarcfam(String marcfam) {
		this.marcfam = marcfam;
	}
	
}
