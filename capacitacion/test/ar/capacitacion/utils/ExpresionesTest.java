package ar.capacitacion.utils;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ExpresionesTest {

	@Test
	public void testExpresionRegularSimples() {
		// prueba literal
		String prueba = "Hola";
		assertTrue(prueba.matches("Hola"));

		String prueba1 = "Hola363";
		assertTrue(prueba1.matches("Hola363"));

		// rexexp "." un caracter
		String prueba2 = "a";
		assertTrue(prueba2.matches("."));
	}
}
