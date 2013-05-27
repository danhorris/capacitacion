package ar.capacitacion.threads;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestSynchronized {

	/*Instancia compartida*/
	public class Secuenciador  {
		
		public int siguiente =0;
		
		public void setSiguiente(int siguiente) {
			this.siguiente = siguiente;
		}
		public int getSiguiente() {
			return siguiente;
		}
	}
	
	//Hilo1
	public class Hilo1 extends Thread {
		private Secuenciador referencia;
		public Hilo1(Secuenciador objeto1) {
		this.referencia = objeto1;
		}
		
		@Override
		public void run() {
			referencia.setSiguiente(referencia.getSiguiente()+1);
			System.out.println("Obtuve " + referencia.getSiguiente());
		}
	}

	
	@Test
	public void testSynchronized() {
		Secuenciador objeto = new Secuenciador();
		List<Thread> hilos = new ArrayList<Thread>();
		
		for (int i = 0; i < 20; i++) {
			Hilo1 hilo1 = new Hilo1(objeto);
			hilos.add(hilo1);
			hilo1.start();
			try {
				hilo1.join();
			} catch (InterruptedException e) {
			}
		}
		
				

	}

}
