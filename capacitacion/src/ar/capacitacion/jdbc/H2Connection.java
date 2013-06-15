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

			// invoke static to method load() in class "org.h2.Driver"
			// DriverManager.registerDriver(INSTANCE);
			Class.forName("org.h2.Driver");

			// protocol:vendor:driver:server:port:serverInstance
			conn = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;

	}

}
