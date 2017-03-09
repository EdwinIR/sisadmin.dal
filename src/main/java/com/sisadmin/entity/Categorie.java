package com.sisadmin.entity;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "categories")
public class Categorie {
		
	private long idSa;
	private String id;		
	private String name;
	private String parentid;
	Byte[] image;
	private String texttip;
	private Boolean catshowname;
	private String roles;
	private String usuarios;
	private int orden;
	private BigDecimal margenBase;
	private BigDecimal margenA;
	private BigDecimal margenB;
	private BigDecimal margenC;
	private String usuarioCreacion;
	private String usuarioModificacion;
	private Timestamp fechaCreacion;
	private Timestamp fechaModificacion;
	private Zona zona;
	private String codigo;
	//private String descripcionZona;
	 
	  

	@Id
    @Column(name = "id_sa")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getIdSa() {
		return idSa;
	}
	public void setIdSa(long idSa) {
		this.idSa = idSa;
	}
	
	@Column(name = "id")
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	@Column(name = "name")
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Column(name = "parentid")
	public String getParentid() {
		return parentid;
	}
	public void setParentid(String parentid) {
		this.parentid = parentid;
	}
		
	/*@Lob
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}*/
	
	
	@Column(name = "texttip")
	public String getTexttip() {
		return texttip;
	}
	public void setTexttip(String texttip) {
		this.texttip = texttip;
	}
	
	@Column(name = "catshowname")
	public Boolean getCatshowname() {
		return catshowname;
	}
	public void setCatshowname(Boolean catshowname) {
		this.catshowname = catshowname;
	}
	
	@Column(name = "roles")
	public String getRoles() {
		return roles;
	}
	public void setRoles(String roles) {
		this.roles = roles;
	}
		
	@Column(name = "usuarios")
	public String getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(String usuarios) {
		this.usuarios = usuarios;
	}
	
	@Column(name = "orden")
	public int getOrden() {
		return orden;
	}
	public void setOrden(int orden) {
		this.orden = orden;
	}
	
	@Column(name = "margen_base")
	public BigDecimal getMargenBase() {
		return margenBase;
	}
	public void setMargenBase(BigDecimal margenBase) {
		this.margenBase = margenBase;
	}
	
	@Column(name = "margen_a")
	public BigDecimal getMargenA() {
		return margenA;
	}
	public void setMargenA(BigDecimal margenA) {
		this.margenA = margenA;
	}
	
	
	@Column(name = "margen_b")
	public BigDecimal getMargenB() {
		return margenB;
	}
	public void setMargenB(BigDecimal margenB) {
		this.margenB = margenB;
	}
	
	@Column(name = "margen_c")
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
	
	@ManyToOne
	@JoinColumn(name = "zona_id")
	public Zona getZona() {
		return zona;
	}
	public void setZona(Zona zona) {
		this.zona = zona;
	}
	
	@Column(name = "codigo")
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
	@Column(name = "image")
	public Byte[] getImage() {
		return image;
	}
	public void setImage(Byte[] image) {
		this.image = image;
	}
	
	
	
	
}
