package ar.capacitacion.threads;

import org.junit.Test;

public class CalculadorPrimosTest {

	@Test
	public void test() {
		CalculadorPrimos calculator = new CalculadorPrimos();
		calculator.start();
		calculator.start();
		 
		 try {
			Thread.sleep(CalculadorPrimos.TEN_SECONDS);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}

		 calculator.finished = true;

	}

}
