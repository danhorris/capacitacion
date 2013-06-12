package ar.capacitacion.rmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import ar.capacitacion.client.CalculatorClient;
import ar.capacitacion.rmi.server.CalculatorServer;

public class CalculatorRmiTest {

	private Registry registry;

	@Before
	public void crearRegistro() {
		try {
			registry = LocateRegistry.createRegistry(1099);
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test
	public void testBingObject() {

		new CalculatorServer().start();
		Assert.assertNotNull(new CalculatorClient().obtenerCalculator());

	}

}
