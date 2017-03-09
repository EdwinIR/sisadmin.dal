package com.sisadmin.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;




@Entity
@Table(name = "products")
public class Producto implements Serializable {
 
	private long idSa;
	private String id;
	private int codigo;  //codigo de importacion, codigo original de plasticos2000
	private String codigoEquivalente; //reference
	private String codigoBarra;  //code
	private String descripcion;  //name
	private BigDecimal pesoKilogramo;	
	private Boolean afectoIgv;
	private BigDecimal precioCompra; //pricebuy
	//private UnidadMedida unidadMedidaPrincipal;
	private String unidadMedidaPrincipal;
	private Proveedor proveedor;
	private MarcaFamilia marcaFamilia;	
	private String usuarioCreacion;
	private String usuarioModificacion;
	private Timestamp fechaCreacion;
	private Timestamp fechaModificacion;
	private Collection<ProductoAlmacen> productoAlmacen = new ArrayList<ProductoAlmacen>();
	private Collection<ProductoUbicacion> ubicaciones = new ArrayList<ProductoUbicacion>();
	private boolean activo;
	private boolean tratamientoEspecial;
	private Date fechaUltimaCompra;
	private BigDecimal precioUltimaCompra;
	private BigDecimal precioBase;
	
	/** campos agregados **/
	private String marca;
	private String category;
	private String taxcat;		//001
	private BigDecimal pricesell;	
	private BigDecimal stockcost;  //0
	private BigDecimal stockvolume	; //0	
	private Boolean iscom;		//f
	private Boolean isscale;	//f
	private Boolean iskitchen;//t
	private Boolean printkb;//f
	private Boolean sendstatus;//f
	private Boolean isservice;//f
	private String display;	//"<HTML><center>MILHOJAS"
	private Boolean isvprice; //f
	private Boolean isverpatrib; //f
	private String texttip;	//"MILHOJAS"
	private Boolean warranty; //f
	private BigDecimal stockunits; //0
	
	
	
	private ProductoDetalle productoDetalleA;
	private ProductoDetalle productoDetalleB;
	private ProductoDetalle productoDetalleC;
	
	
	
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
	
	/**
	@Column(name = "codigo")
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}	**/
	
	@Column(name = "code")
	public String getCodigoBarra() {
		return codigoBarra;
	}
	public void setCodigoBarra(String codigoBarra) {
		this.codigoBarra = codigoBarra;
	}	
	
	@Column(name = "name")
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	@Column(name = "pricebuy")
	public BigDecimal getPrecioCompra() {
		return precioCompra;
	}
	public void setPrecioCompra(BigDecimal precioCompra) {
		this.precioCompra = precioCompra;
	}
	
	/**
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
	}	**/	
		
	@Column(name = "reference")
	 public String getCodigoEquivalente() {
		return codigoEquivalente;
	}
	public void setCodigoEquivalente(String codigoEquivalente) {
		this.codigoEquivalente = codigoEquivalente;
	}
	
	@Column(name = "peso_kilogramo")
	public BigDecimal getPesoKilogramo() {
		return pesoKilogramo;
	}
	public void setPesoKilogramo(BigDecimal pesoKilogramo) {
		this.pesoKilogramo = pesoKilogramo;
	}
	
	@Column(name = "afecto_igv")
	public Boolean getAfectoIgv() {
		return afectoIgv;
	}
	public void setAfectoIgv(Boolean afectoIgv) {
		this.afectoIgv = afectoIgv;
	}
	
	
	/*@JoinColumns(value = {
	          @JoinColumn(name = "b", referencedColumnName = "b"),
	          @JoinColumn(name = "c", referencedColumnName = "c") })
	*/
	
	
	/**
	@ManyToOne
	@JoinColumn(name = "ubicacion_id")
	public Ubicacion getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(Ubicacion ubicacion) {
		this.ubicacion = ubicacion;
	}**/
	
	/**
	@ManyToOne
	@JoinColumn(name = "unidad_medida_a")
	public UnidadMedida getUnidadMedidaA() {
		return unidadMedidaA;
	}
	public void setUnidadMedidaA(UnidadMedida unidadMedidaA) {
		this.unidadMedidaA = unidadMedidaA;
	}
	
	@ManyToOne
	@JoinColumn(name = "unidad_medida_b")
	public UnidadMedida getUnidadMedidaB() {
		return unidadMedidaB;
	}
	public void setUnidadMedidaB(UnidadMedida unidadMedidaB) {
		this.unidadMedidaB = unidadMedidaB;
	}
	
	@ManyToOne
	@JoinColumn(name = "unidad_medida_c")
	public UnidadMedida getUnidadMedidaC() {
		return unidadMedidaC;
	}
	public void setUnidadMedidaC(UnidadMedida unidadMedidaC) {
		this.unidadMedidaC = unidadMedidaC;
	}
	 **/
	

	/**
	@ManyToOne
	@JoinColumn(name = "unidad_medida_principal_id")
	public UnidadMedida getUnidadMedidaPrincipal() {
		return unidadMedidaPrincipal;
	}
	public void setUnidadMedidaPrincipal(UnidadMedida unidadMedidaPrincipal) {
		this.unidadMedidaPrincipal = unidadMedidaPrincipal;
	}
	**/
	
	
	 
	  @ManyToOne
	@JoinColumn(name = "proveedor_id")
	public Proveedor getProveedor() {
		return proveedor;
	}
	
	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
	
	/*@ManyToOne
	@JoinColumn(name = "familia_id")
	public Familia getFamilia() {
		return familia;
	}
	public void setFamilia(Familia familia) {
		this.familia = familia;
	}*/
	
	/*@ManyToOne
	@JoinColumn(name = "marca_id")
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}*/
	/*
	@ManyToOne
	@JoinColumn(name = "modelo_id")  
	public Modelo getModelo() {
		return modelo;
	}
	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}*/
	  
	  
	  
	  
	@OneToMany(mappedBy = "producto", cascade=CascadeType.ALL)
	public Collection<ProductoAlmacen> getProductoAlmacen() {
		return productoAlmacen;
	}
	public void setProductoAlmacen(Collection<ProductoAlmacen> productoAlmacen) {
		this.productoAlmacen = productoAlmacen;
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
	@JoinColumn(name = "marca_familia_id")  
	public MarcaFamilia getMarcaFamilia() {
		return marcaFamilia;
	}
	public void setMarcaFamilia(MarcaFamilia marcaFamilia) {
		this.marcaFamilia = marcaFamilia;
	}
	
	/**
	@ManyToOne
	@JoinColumn(name = "almacen_id")
	public Almacen getAlmacen() {
		return almacen;
	}
	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}
	@ManyToOne
	@JoinColumn(name="zona_id")
	public Zona getZona() {
		return zona;
	}
	public void setZona(Zona zona) {
		this.zona = zona;
	}**/
	
	@Column(name="activo")
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	@Column(name="tratamiento_especial")
	public boolean isTratamientoEspecial() {
		return tratamientoEspecial;
	}
	public void setTratamientoEspecial(boolean tratamientoEspecial) {
		this.tratamientoEspecial = tratamientoEspecial;
	}
	@Column(name="fecha_ultima_compra")
	public Date getFechaUltimaCompra() {
		return fechaUltimaCompra;
	}
	public void setFechaUltimaCompra(Date fechaUltimaCompra) {
		this.fechaUltimaCompra = fechaUltimaCompra;
	}
	@Column(name="precio_ultima_compra")
	public BigDecimal getPrecioUltimaCompra() {
		return precioUltimaCompra;
	}
	public void setPrecioUltimaCompra(BigDecimal precioUltimaCompra) {
		this.precioUltimaCompra = precioUltimaCompra;
	}
	@Column(name="precio_base")
	public BigDecimal getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(BigDecimal precioBase) {
		this.precioBase = precioBase;
	}
	
	//Detalle Producto
	/**@OneToMany(mappedBy="producto", cascade=CascadeType.ALL)
	public Collection<ProductoDetalle> getDetalleProductos() {
		return detalleProductos;
	}
	public void setDetalleProductos(Collection<ProductoDetalle> detalleProductos) {
		this.detalleProductos = detalleProductos;
	}**/
	
	
	
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="producto_detalle_a_id")
	public ProductoDetalle getProductoDetalleA() {
		return productoDetalleA;
	}
	public void setProductoDetalleA(ProductoDetalle productoDetalleA) {
		this.productoDetalleA = productoDetalleA;
	}
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="producto_detalle_b_id")
	public ProductoDetalle getProductoDetalleB() {
		return productoDetalleB;
	}
	public void setProductoDetalleB(ProductoDetalle productoDetalleB) {
		this.productoDetalleB = productoDetalleB;
	}
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="producto_detalle_c_id")
	public ProductoDetalle getProductoDetalleC() {
		return productoDetalleC;
	}
	public void setProductoDetalleC(ProductoDetalle productoDetalleC) {
		this.productoDetalleC = productoDetalleC;
	}
	
	@OneToMany(mappedBy="producto",cascade=CascadeType.ALL)
	public Collection<ProductoUbicacion> getUbicaciones() {
		return ubicaciones;
	}
	public void setUbicaciones(Collection<ProductoUbicacion> ubicaciones) {
		this.ubicaciones = ubicaciones;
	}
	
	
	@Column(name="unidad_medida_principal")
	public String getUnidadMedidaPrincipal() {
		return unidadMedidaPrincipal;
	}
	public void setUnidadMedidaPrincipal(String unidadMedidaPrincipal) {
		this.unidadMedidaPrincipal = unidadMedidaPrincipal;
	}
	
	@Column(name="codigo")
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	
	/*campos sispos*/
	@Column(name="marca")
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	@Column(name="category")
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	@Column(name="taxcat")
	public String getTaxcat() {
		return taxcat;
	}
	public void setTaxcat(String taxcat) {
		this.taxcat = taxcat;
	}
	
	@Column(name="pricesell")
	public BigDecimal getPricesell() {
		return pricesell;
	}
	public void setPricesell(BigDecimal pricesell) {
		this.pricesell = pricesell;
	}
	
	@Column(name="stockcost")
	public BigDecimal getStockcost() {
		return stockcost;
	}
	public void setStockcost(BigDecimal stockcost) {
		this.stockcost = stockcost;
	}
	
	@Column(name="stockvolume")
	public BigDecimal getStockvolume() {
		return stockvolume;
	}
	public void setStockvolume(BigDecimal stockvolume) {
		this.stockvolume = stockvolume;
	}	
	
	@Column(name="iscom")
	public Boolean getIscom() {
		return iscom;
	}
	public void setIscom(Boolean iscom) {
		this.iscom = iscom;
	}
	
	@Column(name="isscale")	
	public Boolean getIsscale() {
		return isscale;
	}
	public void setIsscale(Boolean isscale) {
		this.isscale = isscale;
	}
	
	@Column(name="iskitchen")
	public Boolean getIskitchen() {
		return iskitchen;
	}
	public void setIskitchen(Boolean iskitchen) {
		this.iskitchen = iskitchen;
	}
	
	@Column(name="printkb")
	public Boolean getPrintkb() {
		return printkb;
	}
	public void setPrintkb(Boolean printkb) {
		this.printkb = printkb;
	}
	
	@Column(name="sendstatus")
	public Boolean getSendstatus() {
		return sendstatus;
	}
	public void setSendstatus(Boolean sendstatus) {
		this.sendstatus = sendstatus;
	}
	
	@Column(name="isservice")
	public Boolean getIsservice() {
		return isservice;
	}
	public void setIsservice(Boolean isservice) {
		this.isservice = isservice;
	}
	
	
	@Column(name="display")
	public String getDisplay() {
		return display;
	}
	public void setDisplay(String display) {
		this.display = display;
	}
	
	
	@Column(name="isvprice")
	public Boolean getIsvprice() {
		return isvprice;
	}
	public void setIsvprice(Boolean isvprice) {
		this.isvprice = isvprice;
	}
	
	@Column(name="isverpatrib")
	public Boolean getIsverpatrib() {
		return isverpatrib;
	}
	public void setIsverpatrib(Boolean isverpatrib) {
		this.isverpatrib = isverpatrib;
	}	
	
	@Column(name="texttip")
	public String getTexttip() {
		return texttip;
	}
	public void setTexttip(String texttip) {
		this.texttip = texttip;
	}
	
	@Column(name="warranty")
	public Boolean getWarranty() {
		return warranty;
	}
	public void setWarranty(Boolean warranty) {
		this.warranty = warranty;
	}
	
	@Column(name="stockunits")
	public BigDecimal getStockunits() {
		return stockunits;
	}
	public void setStockunits(BigDecimal stockunits) {
		this.stockunits = stockunits;
	}
	
	

}



//private Familia familia;
//private Marca marca;

/**
private UnidadMedida unidadMedidaA;
private UnidadMedida unidadMedidaB;
private UnidadMedida unidadMedidaC;**/

/**
private BigDecimal margenBase;
private BigDecimal margenA;
private BigDecimal margenB;
private BigDecimal margenC;
**/

/**
private Ubicacion ubicacion;
private Almacen almacen;
private Zona zona;**/

//private Collection<ProductoDetalle> detalleProductos = new ArrayList<ProductoDetalle>();

