package ar.capacitacion.rmi.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import ar.capacitacion.rmi.client.ICalculator;

/**
 * @author dan
 * 
 */
public class CalculatorImpl extends UnicastRemoteObject implements ICalculator {

	public CalculatorImpl() throws RemoteException {
		super();
	}

	private static final long serialVersionUID = 874189387000212654L;

	public long addition(long a, long b) {
		return a + b;
	}

	public long subtraction(long a, long b) {
		return a - b;
	}

	public long multiplication(long a, long b) {
		return a * b;
	}

	public long division(long a, long b) {
		return a / b;
	}

}
