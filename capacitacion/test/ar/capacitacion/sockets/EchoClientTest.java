package ar.capacitacion.sockets;

import java.io.IOException;
import java.net.ConnectException;
import java.net.UnknownHostException;

import junit.framework.Assert;

import org.junit.After;
import org.junit.Test;

public class EchoClientTest {

	private EchoClient client;
	private EchoServer server;

	public class HiloServer extends Thread {
		EchoServer echoServer;

		public HiloServer(EchoServer server) {
			this.echoServer = server;
		}

		@Override
		public void run() {
			echoServer.comenzarEscucha();
		}
	}

	/**
	 * Si el server no esta activo tenemos una ConnectException.
	 * 
	 * @throws UnknownHostException
	 * @throws IOException
	 */
	@Test(expected = ConnectException.class)
	public void testConnection() throws UnknownHostException, IOException {
		client = new EchoClient();
		client.connectToServer("localhost", 6000);
	}

	@Test
	public void testRespuestaServidor() throws UnknownHostException,
			IOException {

		server = new EchoServer();
		server.crearSocketServer(5555);

		new HiloServer(server).start();

		client = new EchoClient();
		client.connectToServer("localhost", 5555);
		client.setMensajeServidor("probando");
		Assert.assertTrue(server.getInputStream().readLine().equals("probando"));

	}

	@After
	public void cerrarSocket() throws IOException {
		if (client.getSocket() != null) {
			client.getSocket().close();
		}
		if (server != null && server.getSocketServer() != null) {
			server.getSocketServer().close();
		}

	}
}
