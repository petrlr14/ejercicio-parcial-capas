package com.capas.uca.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(schema = "public", name = "contribuyente")
public class Contribuyente {

	@Id
	@GeneratedValue(generator = "contribuyente_c_contribuyente_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "contribuyente_c_contribuyente_seq", sequenceName = "public.contribuyente_c_contribuyente_seq", allocationSize = 1)
	@Column(name = "c_contribuyente")
	private Long contribuyenteId;
	@JoinColumn(name = "c_importancia", referencedColumnName = "c_importancia")
	@ManyToOne(fetch = FetchType.LAZY)
	private Importancia importanciaId;
	@Column(name = "s_nombre")
	private String nombre;
	@Column(name = "s_apellido")
	private String apellido;
	@Column(name = "s_nit")
	private String nit;
	@Column(name = "f_fecha_ingreso")
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(iso = ISO.DATE)
	private Date fechaIngreso;

	public Contribuyente() {

	}

	public Long getContribuyenteId() {
		return contribuyenteId;
	}

	public void setContribuyenteId(Long contribuyenteId) {
		this.contribuyenteId = contribuyenteId;
	}

	public Importancia getImportanciaId() {
		return importanciaId;
	}

	public void setImportanciaId(Importancia importanciaId) {
		this.importanciaId = importanciaId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNit() {
		return nit;
	}

	public void setNit(String nit) {
		this.nit = nit;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

}
