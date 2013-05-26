package ar.capacitacion.threads;

import org.junit.Test;

public class TestSynchronized {

	/*Instancia compartida*/
	public class ObjetoCompartido  {
		public int posicion =0;
		
		public synchronized void setPosicion(int posicion) {
			this.posicion = posicion;
		}
		public int getPosicion() {
			return posicion;
		}
	}
	
	//Hilo1
	public class Hilo1 extends Thread {
		private ObjetoCompartido referencia;
		public Hilo1(ObjetoCompartido objeto1) {
		this.referencia = objeto1;
		}
		
		@Override
		public void run() {
			int nuevaPosicion = referencia.getPosicion() + 100; 
			referencia.setPosicion(nuevaPosicion);
			System.out.println("Hilo1 " + referencia.getPosicion());
		}
	}

	//Hilo2
	public class Hilo2 extends Thread {
		private ObjetoCompartido referencia;
		public Hilo2(ObjetoCompartido objeto1) {
		this.referencia = objeto1;
		}

		@Override
		public void run() {
			int nuevaPosicion = referencia.getPosicion() + 200; 
			referencia.setPosicion(nuevaPosicion);
			System.out.println("Hilo2 " + referencia.getPosicion());
		}
	}
	
	@Test
	public void testSynchronized() {
		ObjetoCompartido objeto = new ObjetoCompartido();
		Hilo1 hilo1 = new Hilo1(objeto);
		Hilo2 hilo2 = new Hilo2(objeto);
		hilo1.start();		
		hilo2.start();
		
		
	}

}
