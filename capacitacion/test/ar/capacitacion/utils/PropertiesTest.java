package ar.capacitacion.utils;

import static org.junit.Assert.assertNotNull;

import java.io.FileInputStream;
import java.util.Properties;

import org.junit.Test;

/**
 * @author dan
 * 
 */
public class PropertiesTest {

	/**
	 * Test de lectura de archivo propierties
	 */
	@Test
	public void testPropertiesFile() {
		Properties properties = new Properties();
		try {
			properties.load(new FileInputStream("project.properties"));
		} catch (Exception e) {
		}
		assertNotNull(properties.getProperty("dir.path.input"));
	}
}
