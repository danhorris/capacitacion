package ar.capacitacion.jdbc;

import junit.framework.Assert;

import org.junit.Test;

public class H2JDBCTest {

	@Test
	public void testConnection() {

		Assert.assertNotNull(new H2Connection().getConnection());

	}

}
