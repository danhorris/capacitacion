package ar.capacitacion.rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * @author dan
 * 
 */
public class CalculatorImpl extends UnicastRemoteObject implements ICalculator {

	public CalculatorImpl() throws RemoteException {
		super();
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 874189387000212654L;

	@Override
	public long addition(long a, long b) {

		return 0;
	}

	@Override
	public long subtraction(long a, long b) {

		return 0;
	}

	@Override
	public long multiplication(long a, long b) {

		return 0;
	}

	@Override
	public long division(long a, long b) {

		return 0;
	}

}
