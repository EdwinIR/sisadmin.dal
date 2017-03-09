package com.sisadmin.entity;

import java.io.Serializable;

/*import com.openbravo.basic.BasicException;
import com.openbravo.data.loader.DataRead;
import com.openbravo.data.loader.DataWrite;
import com.openbravo.data.loader.SerializableRead;
import com.openbravo.data.loader.SerializableWrite;
import com.openbravo.data.loader.SerializerRead;*/

public class UnidadMedidaInfo implements /*SerializableWrite, SerializableRead,*/ Serializable{

	protected int id;
	protected String descripcion;
	protected String abreviado;
	protected int fisico;
	
	/*@Override
	public void readValues(DataRead dr) throws BasicException {
		id = dr.getInt(1);
		descripcion = dr.getString(2);
		abreviado = dr.getString(3);
		fisico = dr.getInt(4);		
	}

	@Override
	public void writeValues(DataWrite dp) throws BasicException {
		dp.setInt(1,id);
		dp.setString(2, descripcion);
		dp.setString(3,abreviado);
		dp.setInt(4, fisico);		
	}
	
	
	 public static SerializerRead getSerializerRead() {
	        return new SerializerRead() {
	            @Override
	            public Object readValues(DataRead dr) throws BasicException {
	                UnidadMedidaInfo uni = new UnidadMedidaInfo();
	                uni.id = dr.getInt(1);                                 
	                uni.descripcion = dr.getString(2);
	                uni.abreviado = dr.getString(3);
	                uni.fisico = dr.getInt(4);             
	                return uni;
	            }
	        };
	    }
*/
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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
