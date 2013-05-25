package ar.capacitacion.threads;

/**
 * Calcula numeros primos en 10 segundos. 
 * @author dan
 * 
 */
public class CalculadorPrimos extends Thread {

	public static final int MAX_PRIMES = 1000000;
	public static final int TEN_SECONDS = 10000;

	public volatile boolean finished = false;

	public void run() {

		int[] primes = new int[MAX_PRIMES];
		int count = 0;
		for (int i = 2; count < MAX_PRIMES; i++) {

			// Check to see if the timer has expired
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
