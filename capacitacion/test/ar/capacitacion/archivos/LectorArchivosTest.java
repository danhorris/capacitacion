package ar.capacitacion.archivos;

import org.junit.Test;

public class LectorArchivosTest {

	@Test
	public void testPathArchivoCorrecto() {
		LectorArchivos lector = new LectorArchivos();
		lector.leer("c:/Users/dan/Documents/GitHub/capacitacion/capacitacion/resources/archivo.txt");
	}
}
