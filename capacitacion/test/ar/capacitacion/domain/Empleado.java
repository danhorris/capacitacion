package ar.capacitacion.domain;

import java.util.Date;

public class Empleado {

	private Long id;

	private String nombre;
	
	private String observaciones;
	
	private Date fechaAlta;
	
	private Long nroOficina;

	public Empleado() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public Long getNroOficina() {
		return nroOficina;
	}

	public void setNroOficina(Long nroOficina) {
		this.nroOficina = nroOficina;
	}

}
