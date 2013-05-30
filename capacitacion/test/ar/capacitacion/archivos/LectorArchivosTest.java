package ar.capacitacion.archivos;

import static org.junit.Assert.assertFalse;

import java.util.List;

import org.junit.Test;

public class LectorArchivosTest {

	@Test
	public void testPathArchivoURLCompleta() {
		LectorArchivos lector = new LectorArchivos();
		List<String> lineas = lector
				.leerLineas("c:/Users/dan/Documents/GitHub/capacitacion/capacitacion/resources/archivo.txt");
		assertFalse(lineas.isEmpty());

	}
}
