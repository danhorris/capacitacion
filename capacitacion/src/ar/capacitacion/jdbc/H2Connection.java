package ar.capacitacion.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class H2Connection {

	/**
	 * @return
	 */
	public Connection getConnection() {
		Connection conn = null;
		try {
			Class.forName("org.h2.Driver");
			conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;

	}

}
