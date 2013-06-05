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

		prueba3 = "Hola";
		assertTrue(prueba3.matches(".*Hola.*"));

		// edad valida de 1 a 999
		// [0-9] indico numeros posibles
		// y ocurrencias {desde,hasta}
		String edadValida = "77";
		assertTrue(edadValida.matches("[0-9]{1,3}"));
		edadValida = "2";
		assertTrue(edadValida.matches("[0-9]{1,3}"));
		edadValida = "999";
		assertTrue(edadValida.matches("[0-9]{1,3}"));
		edadValida = "1000";
		assertFalse(edadValida.matches("[0-9]{1,3}"));

		String edadInvalida = "dos";
		assertFalse(edadInvalida.matches("[0-9]{1,3}"));

		// Que pasa si pongo 0, es valido segun pattern
		edadValida = "0";
		assertTrue(edadValida.matches("[0-9]{1,3}"));

		// primer caracter entre 1-9
		// los siguientes dos opcionales ()? 0-9
		edadValida = "11";
		assertTrue(edadValida.matches("[1-9]{1}([0-9]{1,2})?"));

		edadInvalida = "09";
		assertFalse(edadInvalida.matches("[1-9]{1}([0-9]{1,2})?"));
	}

	@Test
	public void testEmail() {
		// + indica una o mas ocurrencias
		String emailDan = "danhorris@gmail.com";
		assertTrue(emailDan.matches("[a-zA-Z0-9]+\\@[a-zA-Z0-9]+\\.[a-zA-Z]+"));

		emailDan = "danhorris@gmail.";
		assertFalse(emailDan.matches("[a-zA-Z0-9]+\\@[a-zA-Z0-9]+\\.[a-zA-Z]+"));

		emailDan = "@gmail.com";
		assertFalse(emailDan.matches("[a-zA-Z0-9]+\\@[a-zA-Z0-9]+\\.[a-zA-Z]+"));

		emailDan = "danhorris@gmailcom";
		assertFalse(emailDan.matches("[a-zA-Z0-9]+\\@[a-zA-Z0-9]+\\.[a-zA-Z]+"));

	}
}
