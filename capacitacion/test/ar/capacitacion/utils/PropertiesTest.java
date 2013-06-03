package ar.capacitacion.utils;

import static org.junit.Assert.assertNotNull;

import java.io.FileInputStream;
import java.util.Properties;

import org.junit.Test;

public class PropertiesTest {

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
