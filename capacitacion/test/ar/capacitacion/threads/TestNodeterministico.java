package ar.capacitacion.threads;

import org.junit.Test;

/**
 * @author dan
 *
 */
public class TestNodeterministico {

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
	}


}
