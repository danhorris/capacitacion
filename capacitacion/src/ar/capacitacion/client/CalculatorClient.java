package ar.capacitacion.client;

import java.rmi.Naming;

import ar.capacitacion.rmi.ICalculator;

public class CalculatorClient {

	public ICalculator obtenerCalculator() {
		ICalculator calculator = null;
		try {

			// documentar alternativa

			calculator = (ICalculator) Naming.lookup("Calculator");

		} catch (Exception error) {
			System.out.println(error.getMessage());
		}
		return calculator;
	}
}
