package ar.capacitacion.utils;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
		String patternEdad = "[0-9]{1,3}";

		String edadValida = "77";
		assertTrue(edadValida.matches(patternEdad));

		edadValida = "2";
		assertTrue(edadValida.matches(patternEdad));

		edadValida = "999";
		assertTrue(edadValida.matches(patternEdad));

		edadValida = "1000";
		assertFalse(edadValida.matches(patternEdad));

		String edadInvalida = "dos";
		assertFalse(edadInvalida.matches(patternEdad));

		// Que pasa si pongo 0, es valido segun pattern
		edadValida = "0";
		assertTrue(edadValida.matches(patternEdad));

		// primer caracter entre 1-9
		// los siguientes dos opcionales ()? 0-9
		// Ahora usando Pattern y Matcher es otra manera de hacer lo mismo
		Pattern pattern = Pattern.compile("[1-9]{1}([0-9]{1,2})?");
		edadValida = "11";
		Matcher matcher = pattern.matcher(edadValida);
		assertTrue(matcher.matches());

		edadInvalida = "09";
		assertFalse(edadInvalida.matches("[1-9]{1}([0-9]{1,2})?"));
	}

	@Test
	public void testEmail() {
		// + indica una o mas ocurrencias
		String patternEmailValido = "[a-zA-Z0-9]+\\@[a-zA-Z0-9]+\\.[a-zA-Z]+";

		String emailDan = "danhorris@gmail.com";
		assertTrue(emailDan.matches(patternEmailValido));

		emailDan = "danhorris@gmail.";
		assertFalse(emailDan.matches(patternEmailValido));

		emailDan = "@gmail.com";
		assertFalse(emailDan.matches(patternEmailValido));

		emailDan = "danhorris@gmailcom";
		assertFalse(emailDan.matches(patternEmailValido));

	}
}
