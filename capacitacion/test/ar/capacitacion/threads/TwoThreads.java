package ar.capacitacion.threads;

import org.junit.Test;

public class TwoThreads {
	
	public class Hilo1 extends Thread{
		@Override
		public void run() {
			System.out.println("A");
			System.out.println("B");
		}
	}
	
	
	public class Hilo2 extends Thread{
		@Override
		public void run() {
			System.out.println("1");
			System.out.println("2");
		}
	}


	@Test
	public void test() {
		Hilo1 hilo1 = new Hilo1();
		hilo1.start();
		Hilo2 hilo2 = new Hilo2();
		hilo2.start();
		
	}

}
