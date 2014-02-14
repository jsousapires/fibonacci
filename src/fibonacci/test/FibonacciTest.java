package fibonacci.test;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciTest {

	@Test
	public void RetornaElemento1() {
		Fibonacci elemento = new Fibonacci();
		assertEquals(0, elemento.valorElemento(0));
	}
	@Test
	public void RetornaElemento2() {
		Fibonacci elemento = new Fibonacci();
		assertEquals(1, elemento.valorElemento(1));
	}
	@Test
	public void RetornaElemento3() {
		Fibonacci elemento = new Fibonacci();
		assertEquals(2, elemento.valorElemento(3));
	}
	@Test
	public void RetornaElemento8() {
		Fibonacci elemento = new Fibonacci();
		assertEquals(21, elemento.valorElemento(8));
	}
}
