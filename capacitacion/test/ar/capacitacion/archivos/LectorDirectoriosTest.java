package ar.capacitacion.archivos;

import static org.junit.Assert.assertFalse;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.junit.Before;
import org.junit.Test;

/**
 * @author dan
 * 
 */
public class LectorDirectoriosTest {

	private String dirName;

	@Before
	public void initTest() {
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream("project.properties"));
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		}
		dirName = (String) properties.get("dir.path.input");
	}

	@Test
	public void testDirectorios() {
		LectorDirectorios dir = new LectorDirectorios(dirName);
		assertFalse(dir.obtenerArchivosDeDirectorio().isEmpty());
	}

}
