package ar.capacitacion.archivos;

import static org.junit.Assert.assertFalse;

import java.util.List;

import org.junit.Test;

public class LectorArchivosTest {

	@Test
	public void testPathArchivoCorrecto() {
		
		/*revisar path*/
		LectorArchivos lector = new LectorArchivos(
				"C:/Users/Candela/archivosCapacitacion/20121130.txt");

		List<String> lineas = lector.leer();
		assertFalse(lineas.isEmpty());

	}
}
