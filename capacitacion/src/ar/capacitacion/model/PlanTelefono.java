package ar.capacitacion.model;

import java.math.BigDecimal;

/**
 * @author dan
 *
 */
public class PlanTelefono {
	
	private BigDecimal costo;
	
	private Integer minutosPlan;

	public BigDecimal getCosto() {
		return costo;
	}

	public void setCosto(BigDecimal costo) {
		this.costo = costo;
	}

	public Integer getMinutosPlan() {
		return minutosPlan;
	}

	public void setMinutosPlan(Integer minutosPlan) {
		this.minutosPlan = minutosPlan;
	}	

}
