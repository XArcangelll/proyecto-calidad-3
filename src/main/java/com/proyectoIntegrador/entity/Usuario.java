package com.proyectoIntegrador.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "usuario")

public class Usuario {

	@Column(name = "idusuario")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUsuario;

	@Column(name = "usuario")
	private String nomUsuario;

	@Column(name = "contrasenia")
	private String contrasenia;

	@Column(name = "cargo")
	private String cargo;

	public Usuario(String nomUsuario, String contrasenia, String cargo) {
		super();
		this.nomUsuario = nomUsuario;
		this.contrasenia = contrasenia;
		this.cargo = cargo;
	}

	public Usuario(int idUsuario, String nomUsuario, String contrasenia, String cargo) {
		super();
		this.idUsuario = idUsuario;
		this.nomUsuario = nomUsuario;
		this.contrasenia = contrasenia;
		this.cargo = cargo;
	}

	public Usuario(int idUsuario) {
		super();
		this.idUsuario = idUsuario;
	}

	public Usuario() {
		super();
	}

	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNomUsuario() {
		return nomUsuario;
	}

	public void setNomUsuario(String nomUsuario) {
		this.nomUsuario = nomUsuario;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	
	
	
}
