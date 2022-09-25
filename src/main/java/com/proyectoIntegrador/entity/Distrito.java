package com.proyectoIntegrador.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "distrito")

public class Distrito {
	@Column(name = "iddistrito")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idDistrito;

	@Column(name = "ubigeo")
	private String ubigeo;

	@Column(name = "nombre")
	private String nombre;

	public Distrito(int idDistrito) {
		super();
		this.idDistrito = idDistrito;
	}

	public Distrito() {
		super();
	}

	public int getIdDistrito() {
		return idDistrito;
	}

	public void setIdDistrito(int idDistrito) {
		this.idDistrito = idDistrito;
	}

	public String getUbigeo() {
		return ubigeo;
	}

	public void setUbigeo(String ubigeo) {
		this.ubigeo = ubigeo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

	
	
}
