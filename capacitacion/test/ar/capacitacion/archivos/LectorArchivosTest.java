package ar.capacitacion.archivos;

import static org.junit.Assert.assertFalse;

import java.util.List;

import org.junit.Test;

public class LectorArchivosTest {

	@Test
	public void testPathArchivoCorrecto() {
		LectorArchivos lector = new LectorArchivos("resources/archivo.txt");
		List<String> lineas = lector.leer();
		assertFalse(lineas.isEmpty());
	}
}
