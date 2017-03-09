package com.sisadmin.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class MarcaFamiliaId implements Serializable {

	private Marca marca;
	private Categorie familia;
	
	@ManyToOne
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	
	@ManyToOne
	public Categorie getFamilia() {
		return familia;
	}
	public void setFamilia(Categorie familia) {
		this.familia = familia;
	}
	
	
}
