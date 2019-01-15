package com.proyecto.abc.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TEVENTO")
public class Evento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name=("EVEN_ID"))
	private Long idEvento;
	@Column(name = "EVEN_NOMBRE")
	private String nombre;
	@Column(name = "EVEN_CATEGORIA")
	private String categoria;
	@Column(name = "EVEN_LUGAR")
	private String lugar;
	@Column(name = "EVEN_DIRECCION")
	private String direccion;
	@Column(name = "EVEN_FECHAINICIO")
	private Date fechaInicio;
	@Column(name = "EVEN_FECHAFIN")
	private Date fechaFin;
	@Column(name = "EVEN_MODALIDAD")
	private String modalidad;
	@Column(name = "EVEN_FECHACREACION")
	private Date fechaCreacion;
	@Column(name = "EVEN_FECHAMODIFICACION")
	private Date fechaModificacion;

	// Getters y Setters
	public Long getIdEvento() {
		return idEvento;
	}

	public void setIdEvento(Long idEvento) {
		this.idEvento = idEvento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
		this.fechaFin = fechaFin;
	}

	public String getModalidad() {
		return modalidad;
	}

	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

}
