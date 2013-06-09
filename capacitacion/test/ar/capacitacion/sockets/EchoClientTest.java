package ar.capacitacion.sockets;

import java.io.IOException;
import java.net.ConnectException;
import java.net.UnknownHostException;

import org.junit.Test;

public class EchoClientTest {

	@Test(expected = ConnectException.class)
	public void testConnection() throws UnknownHostException, IOException {
		new EchoClient().getSocket("localhost", 5555);
	}
}
