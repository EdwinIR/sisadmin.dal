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
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "customers")
public class Cliente {

	private long idSa;//idsa
	private String id;//id
	private String identificador;//taxid
	private String razonSocial;//name
	private String direccion;//address
	private String ciudad;//city	
	private String email;//email
	private String telefonoUno;//phone
	private String telefonoDos;//phone2	
	private String tipoDocumento;		
	private String contacto;	
	private String rubro;
	private Date fechaAlta;
	private String usuarioCreacion;
	private String usuarioModificacion;
	private Timestamp fechaCreacion;
	private Timestamp fechaModificacion;	
	
	/**Campos Agregados**/
	private String searchKey ;//searchkey
	private BigDecimal maxDebt;
	private String direccionDos;//address2
	private String region;
	private String country;
	private String firstName;
	private String lastName;
	private String fax;
	private String notes;
	private Boolean visible;//t or f
	private Timestamp curdate;
	private BigDecimal curDebt;
	private Byte[] image;
	
	
	private Collection<ClienteSucursal> detalleClientes = new ArrayList<ClienteSucursal>();
	
	
    @Column(name = "id_sa")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getIdSa() {
		return idSa;
	}
	public void setIdSa(long idSa) {
		this.idSa = idSa;
	}	
	
	@Id
	@Column(name = "id")
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}	
	
	@Column(name = "taxid")
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	
	@Column(name = "tipo_documento")
	public String getTipoDocumento() {
		return tipoDocumento;
	}
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	
	@Column(name = "name")
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	
	@Column(name = "address")
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	@Column(name = "city")
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	@Column(name = "phone")
	public String getTelefonoUno() {
		return telefonoUno;
	}
	public void setTelefonoUno(String telefonoUno) {
		this.telefonoUno = telefonoUno;
	}
	
	@Column(name = "phone2")
	public String getTelefonoDos() {
		return telefonoDos;
	}
	public void setTelefonoDos(String telefonoDos) {
		this.telefonoDos = telefonoDos;
	}
	
	@Column(name = "contacto")
	public String getContacto() {
		return contacto;
	}
	public void setContacto(String contacto) {
		this.contacto = contacto;
	}
	
	@Column(name = "email")
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Column(name = "rubro")
	public String getRubro() {
		return rubro;
	}
	public void setRubro(String rubro) {
		this.rubro = rubro;
	}
	
	@Column(name = "fecha_alta")
	public Date getFechaAlta() {
		return fechaAlta;
	}
	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
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
	/*Ciro 03102016*/
	/*Relacion*/
	@OneToMany(mappedBy="cliente", cascade=CascadeType.ALL)
	public Collection<ClienteSucursal> getDetalleClientes() {
		return detalleClientes;
	}
	public void setDetalleClientes(Collection<ClienteSucursal> detalleClientes) {
		this.detalleClientes = detalleClientes;
	}
	
	@Column(name = "searchkey")
	public String getSearchKey() {
		return searchKey;
	}
	public void setSearchKey(String searchKey) {
		this.searchKey = searchKey;
	}
	
	@Column(name = "maxdebt")
	public BigDecimal getMaxDebt() {
		return maxDebt;
	}
	public void setMaxDebt(BigDecimal maxDebt) {
		this.maxDebt = maxDebt;
	}
	
	@Column(name = "address2")
	public String getDireccionDos() {
		return direccionDos;
	}
	public void setDireccionDos(String direccionDos) {
		this.direccionDos = direccionDos;
	}
	
	@Column(name = "region")
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	
	@Column(name = "country")
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	@Column(name = "firstname")
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	@Column(name = "lastname")
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Column(name = "fax")
	public String getFax() {
		return fax;
	}
	public void setFax(String fax) {
		this.fax = fax;
	}
	
	@Column(name = "notes")
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	
	@Column(name = "visible")
	public Boolean getVisible() {
		return visible;
	}
	public void setVisible(Boolean visible) {
		this.visible = visible;
	}
	
	@Column(name = "curdate")
	public Timestamp getCurdate() {
		return curdate;
	}
	public void setCurdate(Timestamp curdate) {
		this.curdate = curdate;
	}
	
	@Column(name = "curdebt")
	public BigDecimal getCurDebt() {
		return curDebt;
	}
	public void setCurDebt(BigDecimal curDebt) {
		this.curDebt = curDebt;
	}
	
	@Column(name = "image")
	public Byte[] getImage() {
		return image;
	}
	public void setImage(Byte[] image) {
		this.image = image;
	}
	
	
	
}
