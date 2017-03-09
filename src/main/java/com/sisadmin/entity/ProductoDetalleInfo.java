package com.sisadmin.entity;

import java.io.Serializable;

public class ProductoDetalleInfo implements  Serializable{

	protected int id;
	protected String productoId;
	protected String codigoBarra;
	protected int unidadMedidaId;
	protected double precio;
	
	protected int idUnidadMedida;
	protected String abreviado;
	protected int fisico;
	
	public ProductoDetalleInfo(){
		
		id=0;
		productoId="";
		codigoBarra="";
		unidadMedidaId=0;
		precio=0.0;
		idUnidadMedida=0;
		abreviado="";
		fisico=0;
		
	}
	
	/*public static SerializerRead getSerializerRead() {
        return new SerializerRead() {
            @Override
            public Object readValues(DataRead dr) throws BasicException {
                ProductoDetalleInfo productoDetalle = new ProductoDetalleInfo();
                
                	productoDetalle.id = dr.getInt(1);
                	productoDetalle.productoId = dr.getString(2);
                	productoDetalle.codigoBarra = dr.getString(3);
                	productoDetalle.unidadMedidaId = dr.getInt(4);
                	productoDetalle.precio = dr.getDouble(5);
                	productoDetalle.idUnidadMedida = dr.getInt(6);
                	productoDetalle.abreviado = dr.getString(7);
                	productoDetalle.fisico = dr.getInt(8);
                
                return productoDetalle;
            }
        };
    }*/
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductoId() {
		return productoId;
	}
	public void setProductoId(String productoId) {
		this.productoId = productoId;
	}
	public String getCodigoBarra() {
		return codigoBarra;
	}
	public void setCodigoBarra(String codigoBarra) {
		this.codigoBarra = codigoBarra;
	}
	public int getUnidadMedidaId() {
		return unidadMedidaId;
	}
	public void setUnidadMedidaId(int unidadMedidaId) {
		this.unidadMedidaId = unidadMedidaId;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}

	/*@Override
	public void readValues(DataRead dr) throws BasicException {
		id = dr.getInt(1);
		productoId = dr.getString(2);
		codigoBarra = dr.getString(3);
		unidadMedidaId = dr.getInt(4);
		precio = dr.getDouble(5);
		idUnidadMedida = dr.getInt(6);
    	abreviado = dr.getString(7);
    	fisico = dr.getInt(8);
		
	}

	@Override
	public void writeValues(DataWrite dp) throws BasicException {
		dp.setInt(1,id);
		dp.setString(2, productoId);
		dp.setString(3,codigoBarra);
		dp.setInt(4, unidadMedidaId);
		dp.setDouble(5,precio);
		dp.setInt(6,idUnidadMedida);
		dp.setString(7,abreviado);
		dp.setInt(8,fisico);
		
	}*/

	public int getIdUnidadMedida() {
		return idUnidadMedida;
	}

	public void setIdUnidadMedida(int idUnidadMedida) {
		this.idUnidadMedida = idUnidadMedida;
	}

	public String getAbreviado() {
		return abreviado;
	}

	public void setAbreviado(String abreviado) {
		this.abreviado = abreviado;
	}

	public int getFisico() {
		return fisico;
	}

	public void setFisico(int fisico) {
		this.fisico = fisico;
	}
	
	
	
}
