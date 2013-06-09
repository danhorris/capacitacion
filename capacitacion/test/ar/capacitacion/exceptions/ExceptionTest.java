package ar.capacitacion.exceptions;

import org.junit.Test;

/**
 * Ejemplo de Junit4 con lanzamiento de excepciones
 * 
 * @author dan
 * 
 */
public class ExceptionTest {

	@Test(expected = ArithmeticException.class)
	public void divisionWithException() {
		int i = 1 / 0;
	}

}
