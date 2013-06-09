package ar.capacitacion.sockets;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @author dan
 * 
 */
public class EchoClient extends EchoSocket {

	private Socket socket;
	private DataInputStream inputStream;
	private DataOutputStream outPutStream;

	public Socket connectToServer(String adress, int port)
			throws UnknownHostException, IOException {

		socket = new Socket(adress, port);
		inputStream = new DataInputStream(socket.getInputStream());
		outPutStream = new DataOutputStream(socket.getOutputStream());
		return socket;
	}

	public Socket getSocket() {
		return socket;
	}

	public void setMensajeServidor(String string) {
		try {
			outPutStream.writeChars(string);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
