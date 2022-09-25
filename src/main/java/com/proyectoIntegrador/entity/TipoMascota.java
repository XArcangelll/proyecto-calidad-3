package com.proyectoIntegrador.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "tipomascota")

public class TipoMascota {

	@Column(name = "idtipomascota")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTipoMascota;

	@Column(name = "nombre")
	private String nombre;

	public int getIdTipoMascota() {
		return idTipoMascota;
	}

	public void setIdTipoMascota(int idTipoMascota) {
		this.idTipoMascota = idTipoMascota;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
