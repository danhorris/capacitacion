package ar.capacitacion.threads;

import java.util.List;

import ar.capacitacion.archivos.LectorArchivos;

public class HiloLectorArchivo extends Thread {

	private LectorArchivos lectorArchivos;

	List<String> lineasLeidas;

	public HiloLectorArchivo(LectorArchivos lectorArchivos) {
		this.lectorArchivos = lectorArchivos;
	}

	@Override
	public void run() {
		lineasLeidas = lectorArchivos.leerFiltrandoPorRexExp();
	}

	public List<String> getLineasLeidas() {
		return lineasLeidas;
	}

	public void setLineasLeidas(List<String> lineasLeidas) {
		this.lineasLeidas = lineasLeidas;
	}

	public LectorArchivos getLectorArchivos() {
		return lectorArchivos;
	}

	public void setLectorArchivos(LectorArchivos lectorArchivos) {
		this.lectorArchivos = lectorArchivos;
	}

}
