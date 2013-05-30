package ar.capacitacion.threads;

import java.util.Date;

import org.junit.Test;

public class TestThreadDaemon {

	public class Hilo1 extends Thread {
		@Override
		public void run() {
			while (true) {
				System.out.println(new Date());
			}

		}
	}

	@Test
	public void testTimer() {
		Hilo1 hilo1 = new Hilo1();
		// Se hace un hilo daemon ANTES que se le de start()
		hilo1.setDaemon(true);
		hilo1.start();
		try {
			hilo1.join();
		} catch (InterruptedException e) {
		
		}
	}

}
