package ar.capacitacion.threads;

import org.junit.Test;

/**
 * Un hilo espera por la ejecucion del otro.
 * 
 * @author dan
 * 
 */
public class TestThreadsJoinBetween {

	public class Hilo1 extends Thread {

		private long sleep;

		public Hilo1(long sleepTime) {
			this.sleep = sleepTime;
		}

		@Override
		public void run() {
			try {
				Thread.sleep(sleep);
			} catch (InterruptedException e) {
			}
			System.out.println("A");
			System.out.println("B");
		}
	}

	public class Hilo2 extends Thread {

		private Hilo1 waitsFor;

		public Hilo2(Hilo1 hilo1) {
			this.waitsFor = hilo1;
		}

		@Override
		public void run() {
			try {
				waitsFor.join();
			} catch (InterruptedException e) {
			}
			System.out.println("1");
			System.out.println("2");
		}
	}

	@Test
	public void test() {
		Hilo1 hilo1 = new Hilo1(1000);
		Hilo2 hilo2 = new Hilo2(hilo1);
		hilo1.start();
		hilo2.start();

		try {
			hilo1.join();
			hilo2.join();

		} catch (InterruptedException e) {
		}

	}

}
