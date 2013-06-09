package ar.capacitacion.sockets;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer extends ServerSocket {

	private Socket socketClient;

	public EchoServer(int port) throws IOException {
		super(port);
		socketClient = this.accept();
	}

	public Socket getSocketClient() {
		return socketClient;
	}

	public void setSocketClient(Socket socketClient) {
		this.socketClient = socketClient;
	}

}
