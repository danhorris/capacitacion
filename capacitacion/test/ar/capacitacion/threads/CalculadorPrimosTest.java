package ar.capacitacion.threads;

import org.junit.Test;

public class CalculadorPrimosTest {

	@Test
	public void test() {
		CalculadorPrimos calculator = new CalculadorPrimos();
		calculator.start();
	}

}
