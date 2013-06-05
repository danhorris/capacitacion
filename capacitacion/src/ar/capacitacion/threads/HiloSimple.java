package ar.capacitacion.threads;

/**
 * @author dan
 * 
 */
public class HiloSimple extends Thread {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}

}
