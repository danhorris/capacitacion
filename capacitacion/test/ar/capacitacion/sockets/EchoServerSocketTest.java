package ar.capacitacion.sockets;

import java.io.IOException;
import java.net.BindException;

import org.junit.After;
import org.junit.Test;

public class EchoServerSocketTest {

	private EchoServer echoServer;
	private EchoServer echoServer2;

	/**
	 * No puedo crear dos serversSockets en el mismo puerto. Si lo creo obtengo
	 * una BindException.
	 * 
	 * @throws IOException
	 */
	@Test(expected = BindException.class)
	public void testPuertoEnUso() throws IOException {

		echoServer = new EchoServer();
		echoServer.crearSocketServer(5556);

		echoServer2 = new EchoServer();
		echoServer2.crearSocketServer(5556);

	}

	/**
	 * Cierro los sockets si estuvieron en uso
	 */
	@After
	public void ultimoMetodo() {
		try {

			if (echoServer.getSocketServer() != null) {
				echoServer.getSocketServer().close();
			}
			if (echoServer2.getSocketServer() != null) {
				echoServer2.getSocketServer().close();
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
