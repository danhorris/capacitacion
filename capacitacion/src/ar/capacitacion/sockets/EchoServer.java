package ar.capacitacion.sockets;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author dan
 * 
 */
public class EchoServer {

	/* Servidor de Escucha */
	private ServerSocket socketServer;

	/* Socket que se crea al aceptar una conexion */
	private Socket socketClient;

	// I/O
	private DataInputStream inputStream;
	private DataOutputStream outPutStream;

	public void crearSocketServer(int port) throws IOException {
		socketServer = new ServerSocket(port);

	}

	public void comenzarEscucha() {
		try {
			socketClient = socketServer.accept();
			inputStream = new DataInputStream(socketClient.getInputStream());
			outPutStream = new DataOutputStream(socketClient.getOutputStream());
		} catch (IOException e) {
		}

	}

	public Socket getSocketClient() {
		return socketClient;
	}

	public ServerSocket getSocketServer() {
		return socketServer;
	}

	public DataInputStream getInputStream() {
		return inputStream;
	}

	public void setInputStream(DataInputStream inputStream) {
		this.inputStream = inputStream;
	}

	public DataOutputStream getOutPutStream() {
		return outPutStream;
	}

	public void setOutPutStream(DataOutputStream outPutStream) {
		this.outPutStream = outPutStream;
	}

}
