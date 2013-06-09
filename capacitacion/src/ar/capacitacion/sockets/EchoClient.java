package ar.capacitacion.sockets;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author dan
 * 
 */
public class EchoClient extends EchoSocket {

	private Socket socket;
	private DataInputStream inputStream;
	private PrintStream outPutStream;

	public Socket connectToServer(String adress, int port)
			throws UnknownHostException, IOException {

		socket = new Socket(adress, port);
		inputStream = new DataInputStream(socket.getInputStream());
		outPutStream = new PrintStream(socket.getOutputStream());
		return socket;
	}

	public Socket getSocket() {
		return socket;
	}

	public void setMensajeServidor(String string) {
		outPutStream.println(string);
	}
}
