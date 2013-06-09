package ar.capacitacion.threads;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Ejemplo basico de un test corriendo.
 * 
 * @author dan
 * 
 */
public class HiloSimpleTest {

	@Test
	public void test() {
		HiloSimple hiloSimple = new HiloSimple();
		hiloSimple.start();
		assertEquals(true, hiloSimple.isAlive());

	}

}
