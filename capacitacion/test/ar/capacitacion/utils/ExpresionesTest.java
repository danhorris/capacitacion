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

		// Comienza con regex
		String prueba3 = "regex1236";
		assertTrue(prueba3.matches("^regex"));

		// Termina con regex
		String prueba4 = "1236regex";
		assertTrue(prueba4.matches("regex$"));
	}
}
