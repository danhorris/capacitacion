package ar.capacitacion.archivos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.List;

import org.junit.Test;

public class LectorArchivosTest {

	@Test
	public void testLeerLineasArchivo() {
		LectorArchivos lector = new LectorArchivos("resources/archivo.txt");
		List<String> lineas = lector.leer();
		assertFalse(lineas.isEmpty());
	}

	@Test
	public void testLeerLineasConRexExp() {
		LectorArchivos lector = new LectorArchivos("resources/archivo.txt");
		lector.setRegExp(".*Sanchez.*");
		List<String> lineas = lector.leerFiltrandoPorRexExp();
		assertEquals(lineas.size(), 1);

		LectorArchivos lector2 = new LectorArchivos("resources/archivo.txt");
		lector2.setRegExp(".*(Sanchez|Martinez).*");
		List<String> lineas2 = lector2.leerFiltrandoPorRexExp();
		assertEquals(lineas2.size(), 2);
	}
}
