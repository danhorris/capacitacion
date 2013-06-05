package ar.capacitacion.threads;

import org.junit.Test;

public class CalculadorPrimosTest {

	@Test
	public void test() {
		CalculadorPrimos calculator = new CalculadorPrimos();
		calculator.start();
		
		//Java nos obliga a catchear posibles excepciones
		 try {
			 // duermo por dos segundos
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
		}
		 calculator.finished = true;
	}
}
