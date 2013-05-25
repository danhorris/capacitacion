package ar.capacitacion.utils;

/**
 * @author dan
 *
 */
public class HolaMundo {
	
	private String mensaje;

	public HolaMundo(String string) {
		this.mensaje = string;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public static void main(String[] args) {
		
		HolaMundo holaMundo = new HolaMundo("Hola Mundo");
		
		System.out.println(holaMundo.getMensaje());
	}

}
