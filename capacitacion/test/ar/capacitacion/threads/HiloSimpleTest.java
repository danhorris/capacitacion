package ar.capacitacion.threads;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HiloSimpleTest {

	@Test
	public void test() {
		HiloSimple hiloSimple = new HiloSimple();
		hiloSimple.start();
		assertEquals(true, hiloSimple.isAlive());

	}

}
