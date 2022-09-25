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
@Table(name = "horariosservicios")

public class HorariosServicios {
	@Column(name = "idhorariosservicios")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idHorariosServicios;

	@Column(name = "horario")
	private String horario;
	
	@Column(name = "estado")
	private String estado;

	@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idservicio")
	private Servicio idServicio;

	public int getIdHorariosServicios() {
		return idHorariosServicios;
	}

	public void setIdHorariosServicios(int idHorariosServicios) {
		this.idHorariosServicios = idHorariosServicios;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Servicio getIdServicio() {
		return idServicio;
	}

	public void setIdServicio(Servicio idServicio) {
		this.idServicio = idServicio;
	}
	
	
	
}
