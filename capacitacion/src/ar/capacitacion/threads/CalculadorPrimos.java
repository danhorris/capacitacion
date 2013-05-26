package ar.capacitacion.threads;

/**
 * Calcula numeros primos en un tiempo dado.
 * 
 * @author dan
 * 
 */
public class CalculadorPrimos extends Thread {

	private static final int MAX_PRIMES = 1000000;

	/* variable compartida */
	public volatile boolean finished = false;

	public void run() {
		int[] primes = new int[MAX_PRIMES];
		int count = 0;

		for (int i = 2; count < MAX_PRIMES; i++) {

			if (finished) {
				break;
			}

			boolean prime = true;

			for (int j = 0; j < count; j++) {
				if (i % primes[j] == 0) {
					prime = false;
					break;
				}
			}

			if (prime) {
				primes[count++] = i;
				System.out.println("Found prime: " + i);
			}
		}
	}

}
