package ar.capacitacion.jdbc;

import java.sql.Connection;
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

	private Connection conn;

	@Before
	public void createConnection() {
		conn = new H2Acces().getConnection();
	}

	@After
	public void closeConnection() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testConnection() {
		Assert.assertNotNull(conn);
	}

	@Test
	public void testStamentJDBC() {

	}
}
