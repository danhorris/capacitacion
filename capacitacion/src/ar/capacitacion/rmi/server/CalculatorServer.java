package ar.capacitacion.rmi.server;

import java.rmi.Naming;

import ar.capacitacion.rmi.CalculatorImpl;
import ar.capacitacion.rmi.ICalculator;

/**
 * @author dan
 * 
 */
public class CalculatorServer {

	public void start() {
		try {
			ICalculator c = new CalculatorImpl();
			// rmi://localhost:port/application_name
			Naming.rebind("rmi://localhost:1099/CalculatorService", c);
		} catch (Exception error) {
			System.out.println(error.getMessage());
		}

	}

}
