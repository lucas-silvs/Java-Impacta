package test;

import static org.junit.jupiter.api.Assertions.*;
import calculadora.Calculadora;

import org.junit.jupiter.api.Test;

class CalculadoraTeste {

	@Test
	void test() {
		Calculadora calc = new Calculadora();
		assertEquals(2.0, calc.soma(1.0,1.0), "Deve resultar em 2");
		System.out.printf("%f",calc.soma(1.0,1.0) );
		assertEquals(4.0, calc.sub(10.0,6.0), "Deve resultar em 2");
		assertEquals(6.0, calc.mult(2.0,3.0), "Deve resultar em 2");
		assertEquals(4.0, calc.div(16.0,4.0), "Deve resultar em 2");
	}
	

}
