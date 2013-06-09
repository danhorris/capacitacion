package ar.capacitacion.sockets;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author dan
 * 
 */
public class EchoClient {

	public Socket getSocket(String adress, int port)
			throws UnknownHostException, IOException {
		Socket socket = null;
		socket = new Socket(adress, port);
		return socket;
	}
}
