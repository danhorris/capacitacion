package ar.capacitacion.rmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ar.capacitacion.client.CalculatorClient;
import ar.capacitacion.rmi.server.CalculatorServer;

public class CalculatorRmiTest {

	private Registry registry;
	private CalculatorServer server;

	@Before
	public void crearRegistro() {
		try {

			registry = LocateRegistry.createRegistry(1099);

		} catch (RemoteException e) {
			e.printStackTrace();
		}

		server = new CalculatorServer();
		server.start();

	}

	@Test
	public void testBingObject() {
		Assert.assertNotNull(new CalculatorClient().obtenerCalculator());
	}

	@Test
	public void testRemoteMultiplication() {
		try {
			Assert.assertEquals(new CalculatorClient().obtenerCalculator()
					.multiplication(4, 6), 24);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testRemoteSubstraction() {
		try {
			Assert.assertEquals(new CalculatorClient().obtenerCalculator()
					.subtraction(10, 5), 5);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testSumarRemotamente() {
		try {
			Assert.assertEquals(new CalculatorClient().sumarRemotamente(10, 5),
					15);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}

	@After
	public void desregistrar() {
		try {
			registry.unbind("Calculator");
			UnicastRemoteObject.unexportObject(registry, true);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
