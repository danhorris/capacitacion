package ar.capacitacion.threads;

import org.junit.Test;

/**
 * El hilo del test espera que terminen los hilos instanciados.
 * 
 * @author dan
 * 
 */
public class TestThreadJoinWithMain {

	public class Hilo1 extends Thread {
		@Override
		public void run() {
			System.out.println("A");
			System.out.println("B");
		}
	}

	public class Hilo2 extends Thread {
		@Override
		public void run() {
			System.out.println("1");
			System.out.println("2");
		}
	}

	@Test
	public void test() {
		Hilo1 hilo1 = new Hilo1();
		Hilo2 hilo2 = new Hilo2();
		hilo1.start();
		hilo2.start();

		// java doc “Waits for this thread to die"
		try {
			hilo1.join();
			hilo2.join();
		} catch (InterruptedException e) {
		}

	}

}
