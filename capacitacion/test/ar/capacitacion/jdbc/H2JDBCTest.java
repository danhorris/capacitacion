package ar.capacitacion.jdbc;

import java.sql.ResultSet;
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
	public void testResultSetJDBC() {
		try {
			ResultSet resultSet = h2Acces
					.executeStatment("select count(*) total from comments");
			Assert.assertNotNull(resultSet.findColumn("total"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
