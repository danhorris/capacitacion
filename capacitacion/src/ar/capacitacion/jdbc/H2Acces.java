package ar.capacitacion.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Date;
import java.util.Calendar;


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
			// jdbc:h2:~/feedback

			conn = DriverManager.getConnection(
					"jdbc:h2:tcp://localhost/~/test", "sa", "");
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

	
	public int executePreparedStatementInsertTest(String user,String email, String comentario) throws SQLException {

		// PreparedStatements can use variables and are more efficient
		PreparedStatement preparedStatement = conn
				.prepareStatement("insert into TEST values (default, ?, ?, ?, ?)");


		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new java.util.Date());
		
		preparedStatement.setString(1, user);
		preparedStatement.setString(2, email);
		preparedStatement.setDate(3, new Date(calendar.getTimeInMillis()));
		preparedStatement.setString(4, comentario);
		
		return preparedStatement.executeUpdate();

	}

	public Connection getConn() {
		return conn;
	}
}
