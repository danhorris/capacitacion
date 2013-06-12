package ar.capacitacion.client;

import java.rmi.Naming;

import ar.capacitacion.rmi.ICalculator;

public class CalculatorClient {

	public ICalculator obtenerCalculator() {
		ICalculator calculator = null;
		try {

			// documentar alternativa

			calculator = (ICalculator) Naming
					.lookup("//127.0.0.1:1099/CalculatorService");
		} catch (Exception error) {
			System.out.println(error.getMessage());
		}
		return calculator;
	}
}
