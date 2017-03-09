package com.sisadmin.entity;

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




public class ProductInfoExt {
 
	private long idSa;
	private String id; 
	private String reference; //codigo interno
	private String code; //codigo barra
	private String name;
	private BigDecimal pricebuy; //precioCompra
	private BigDecimal pricesell; //precioVenta
	private String category; 	//UUID foraneo de categoria
	private String marca;		//UUID foraneo de marca
	private String taxcat;
	private String attributesetid;
	private BigDecimal stockcost; 
	private BigDecimal stockvolume; 
	byte[] image;	
	private Boolean iscom;
	private Boolean isscale;
	private Boolean iskitchen;
	private Boolean printkb;
	private Boolean sendstatus;
	private Boolean isservice;
	private String display;		
	byte[] attributes;			
	private Boolean isvprice;
	private Boolean isverpatrib;		
	private String texttip;
	private Boolean warranty;
	private BigDecimal stockunits;
	private Integer codigo;	//codigo interno para busqueda desde sispos
	
	private Proveedor proveedor;  //proveedor_id
	private MarcaFamilia marcaFamilia; //marca_familia_id
	private BigDecimal pesoKilogramo;	//peso_kilogramo
	private boolean tratamientoEspecial;
	private Date fechaUltimaCompra;
	private BigDecimal precioUltimaCompra;
	private BigDecimal precioBase;
	private UnidadMedida unidadMedidaPrincipal;	 

	private ProductoDetalle productoDetalleA;
	private ProductoDetalle productoDetalleB;
	private ProductoDetalle productoDetalleC;
	private String usuarioCreacion;
	private String usuarioModificacion;
	private Timestamp fechaCreacion;
	private Timestamp fechaModificacion;
	private boolean activo;
	private Collection<ProductoAlmacen> productoAlmacen = new ArrayList<ProductoAlmacen>();
	private Collection<ProductoUbicacion> ubicaciones = new ArrayList<ProductoUbicacion>();
		
	/**	
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
	
	@Column(name = "codigo_barra")
	public String getCodigoBarra() {
		return codigoBarra;
	}
	public void setCodigoBarra(String codigoBarra) {
		this.codigoBarra = codigoBarra;
	}	
	
	@Column(name = "descripcion")
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	@Column(name = "precio_compra")
	public BigDecimal getPrecioCompra() {
		return precioCompra;
	}
	public void setPrecioCompra(BigDecimal precioCompra) {
		this.precioCompra = precioCompra;
	}
	
	
		
	@Column(name = "codigo_equivalente")
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
	
	
	
	@ManyToOne
	@JoinColumn(name = "unidad_medida_principal_id")
	public UnidadMedida getUnidadMedidaPrincipal() {
		return unidadMedidaPrincipal;
	}
	public void setUnidadMedidaPrincipal(UnidadMedida unidadMedidaPrincipal) {
		this.unidadMedidaPrincipal = unidadMedidaPrincipal;
	}
	
	
	
	 
	  @ManyToOne
	@JoinColumn(name = "proveedor_id")
	public Proveedor getProveedor() {
		return proveedor;
	}
	
	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
	
	
	  
	  
	  
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
	**/
}




