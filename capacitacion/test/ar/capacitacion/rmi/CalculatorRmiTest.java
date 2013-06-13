package ar.capacitacion.rmi;

import java.rmi.RemoteException;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import ar.capacitacion.rmi.client.CalculatorClient;
import ar.capacitacion.rmi.server.ServerRMI;

public class CalculatorRmiTest {

	private ServerRMI server;

	@Before
	public void crearRegistro() {
		server = new ServerRMI();
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

}
