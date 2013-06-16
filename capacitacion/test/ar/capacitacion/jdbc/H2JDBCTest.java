package ar.capacitacion.jdbc;

import java.sql.SQLException;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author dan
 * 
 */
public class H2JDBCTest {

	private H2Acces h2Acces;

	@Before
	public void createConnection() {
		h2Acces = new H2Acces();
		h2Acces.createConnection();
	}

	@After
	public void closeConnection() {
		try {
			h2Acces.getConn().close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testConnection() {
		Assert.assertNotNull(h2Acces.getConn());
	}

	@Test
	public void testStatmentJDBC() {
		try {
	
			Assert.assertNotNull(h2Acces.executeStatment("select * from comments"));
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}
}
