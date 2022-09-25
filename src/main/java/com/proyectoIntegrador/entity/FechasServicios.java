package com.proyectoIntegrador.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "fechasservicios")

public class FechasServicios {

	@Column(name = "idfechasservicios")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idFechasServicios;

	@Column(name = "fecha")
	private String fecha;

	@Column(name = "estado")
	private String estado;

	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idhorariosservicios")
	private HorariosServicios idHorariosServicios;

	public int getIdFechasServicios() {
		return idFechasServicios;
	}

	public void setIdFechasServicios(int idFechasServicios) {
		this.idFechasServicios = idFechasServicios;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public HorariosServicios getIdHorariosServicios() {
		return idHorariosServicios;
	}

	public void setIdHorariosServicios(HorariosServicios idHorariosServicios) {
		this.idHorariosServicios = idHorariosServicios;
	}
	
	
	
}

