package ar.capacitacion.utils;

import static org.junit.Assert.assertFalse;
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

	@Test
	public void testExpresionesRegulares2() {
		// Contiene string
		String prueba3 = "DijoHola2veces";
		assertTrue(prueba3.matches(".*Hola.*"));

		// edad valida de 1 a 999 - indico caracteres posibles y ocurrencias
		String edadValida = "77";
		assertTrue(edadValida.matches("[0-9]{1,3}"));
		edadValida = "2";
		assertTrue(edadValida.matches("[0-9]{1,3}"));
		edadValida = "999";
		assertTrue(edadValida.matches("[0-9]{1,3}"));
		edadValida = "1000";
		assertFalse(edadValida.matches("[0-9]{1,3}"));
		edadValida = "dos";
		assertFalse(edadValida.matches("[0-9]{1,3}"));
	}
}
