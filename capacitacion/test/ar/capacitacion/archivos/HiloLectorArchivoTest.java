package ar.capacitacion.archivos;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import ar.capacitacion.threads.HiloLectorArchivo;

public class HiloLectorArchivoTest {

	@Test
	public void testHiloArchivo() {
		LectorArchivos lector = new LectorArchivos("resources/archivo.txt");
		lector.setRegExp(".*Sanchez.*");

		HiloLectorArchivo hiloLectorArchivo = new HiloLectorArchivo(lector);
		hiloLectorArchivo.start();

		try {
			hiloLectorArchivo.join();
		} catch (InterruptedException e) {
		}

		assertEquals(hiloLectorArchivo.getLineasLeidas().size(), 1);

	}
}
