package ar.capacitacion.model;

/**
 * @author dan
 *
 */
public class Cliente {
	
	private PlanTelefono planCliente;
	
	private Integer codigoCliente;
	
	private String nombreCliente;

	public PlanTelefono getPlanCliente() {
		return planCliente;
	}

	public void setPlanCliente(PlanTelefono planCliente) {
		this.planCliente = planCliente;
	}

	public Integer getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(Integer codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

}
