package ar.capacitacion.jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;

import ar.capacitacion.domain.Empleado;

/**
 * @author dan
 * 
 */
public class H2Acces {

	private Connection conn;

	/**
	 * @return
	 */
	public Connection createConnection() {
		conn = null;
		try {

			// invoke static to method load() in class "org.h2.Driver"
			// DriverManager.registerDriver(INSTANCE);
			Class.forName("org.h2.Driver");

			// protocol:vendor:driver:server:port:serverInstance

			// In-memory (private)
			// jdbc:h2:mem:
			// In-memory (named)
			// jdbc:h2:mem:<databaseName>
			// jdbc:h2:mem:test_mem

			// Server mode (remote connections) using TCP/IP
			// jdbc:h2:tcp://<server>[:<port>]/[<path>]<databaseName>
			// jdbc:h2:tcp://localhost/~/test
			// jdbc:h2:tcp://dbserv:8084/~/sample
			// jdbc:h2:tcp://localhost/mem:test

			conn = DriverManager
					.getConnection(
							"jdbc:h2:tcp://localhost/mem:test;INIT=runscript from '~/create.sql'",
							"sa", "");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}

	/**
	 * @param sql
	 * @return ResultSet
	 * @throws SQLException
	 */
	public ResultSet executeStatment(String sql) throws SQLException {
		// Statements allow to issue SQL queries to the database
		Statement statement = conn.createStatement();
		// Result set get the result of the SQL query
		ResultSet resultSet = statement.executeQuery(sql);
		return resultSet;
	}

	public int executePreparedStatementInsertTest(String user, String email,
			String comentario) throws SQLException {

		// PreparedStatements can use variables and are more efficient
		PreparedStatement preparedStatement = conn
				.prepareStatement("INSERT INTO EMPLEADO VALUES (default, ?, ?, ?)");

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new java.util.Date());

		preparedStatement.setString(1, user);
		preparedStatement.setDate(2, new Date(calendar.getTimeInMillis()));
		preparedStatement.setString(3, comentario);

		return preparedStatement.executeUpdate();

	}

	public Connection getConn() {
		return conn;
	}

	public Empleado getEmpleado(int idEmpleado) throws SQLException {
		Empleado empleado = null;

		PreparedStatement preparedStatement = conn
				.prepareStatement("SELECT * FROM EMPLEADO WHERE ID= ?");
		preparedStatement.setLong(1, idEmpleado);

		ResultSet resultSet = preparedStatement.executeQuery();

		while (resultSet.next()) {
			empleado = new Empleado();
			empleado.setId(resultSet.getLong(1));
			empleado.setNombre(resultSet.getString(2));
		}

		return empleado;

	}
}
