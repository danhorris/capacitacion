package ar.capacitacion.archivos;

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

}
