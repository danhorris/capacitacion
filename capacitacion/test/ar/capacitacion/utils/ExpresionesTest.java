package ar.capacitacion.utils;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ExpresionesTest {

	@Test
	public void testExpresionRegular() {
		String prueba = "123ab";
		assertTrue(prueba.matches("123ab"));
	}
}
