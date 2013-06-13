package ar.capacitacion.rmi.client;

import java.rmi.Naming;
import java.rmi.RemoteException;

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

	public long sumarRemotamente(long a, long b) throws RemoteException {

		return this.obtenerCalculator().addition(a, b);

	}

}
