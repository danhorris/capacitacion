package ar.capacitacion.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import ar.capacitacion.domain.Empleado;

/**
 * @author dan
 * 
 */
public class H2JDBCTest {

	private H2Acces h2Acces;

	@Before
	public void createConnection() {
		h2Acces = new H2Acces(
				"jdbc:h2:mem:test;INIT=runscript from '~/create.sql'", "sa", "");
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
	public void testResultSetStatment() {
		try {
			ResultSet resultSet = h2Acces
					.executeStatment("select count(*) total from EMPLEADO");
			Assert.assertNotNull(resultSet.findColumn("total"));

			// obtengo la primera tupla
			resultSet.next();
			// obtengo la primer columna y la tipo a int.
			Assert.assertEquals(1, resultSet.getInt(1));
			resultSet.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testPreparedStatementInsert() {
		try {
			Assert.assertEquals(1, h2Acces.executePreparedStatementInsertTest(
					"daniel", "primer insert"));

			ResultSet resultSet = h2Acces
					.executeStatment("Select count(*) from EMPLEADO");
			resultSet.next();
			Assert.assertEquals(2, resultSet.getInt(1));
			resultSet.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testBuscarEmpleado() {
		try {
			Empleado empleado = h2Acces.getEmpleado(1);
			Assert.assertNull(empleado.getNroOficina());
			Assert.assertEquals("daniel", empleado.getNombre());
			Assert.assertNull(empleado.getFechaAlta());

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	@Test
	public void testInsertarEmpleado() {
		Empleado empleado = new Empleado();
		empleado.setNombre("Joe");
		empleado.setObservaciones("primer insert");
		try {
			Assert.assertEquals(1, h2Acces.insertarEmpleado(empleado));
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
}
