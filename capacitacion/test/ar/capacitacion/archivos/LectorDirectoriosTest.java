package ar.capacitacion.archivos;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

/**
 * @author dan
 * 
 */
public class LectorDirectoriosTest {

	@Test
	public void testDirectorios() {
		LectorDirectorios dir = new LectorDirectorios("files");
		assertFalse(dir.obtenerArchivosDeDirectorio().isEmpty());
	}

	@Test
	public void testCantidadDeArchivos() {
		LectorDirectorios dir = new LectorDirectorios("files");
		assertEquals(dir.obtenerArchivosDeDirectorio().size(), 3);
	}

}
