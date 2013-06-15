package ar.capacitacion.rmi.server;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import ar.capacitacion.rmi.CalculatorImpl;
import ar.capacitacion.rmi.ICalculator;

/**
 * @author dan
 * 
 */
public class ServerRMI {

	// Creo el registro en metodo static de manera de crearlo una sola vez.
	static {
		try {
			Registry registry = LocateRegistry.createRegistry(1099);

		} catch (RemoteException e) {
		}
	}

	/**
	 * Simulate start a Server RMI.
	 * <p>
	 * Register of services rmi://localhost:port/application_name
	 */
	public void start() {
		try {
			ICalculator c = new CalculatorImpl();

			Naming.rebind("Calculator", c);
		} catch (Exception error) {
			System.out.println(error.getMessage());
		}

	}

}
