package br.ufrgs.inf.tcp.junit.counter;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CounterTest {
	Counter counter1; // declare a Counter here
	
	/**
	* @throws java.lang.Exception
	*/
	@Before
	public void setUp() throws Exception {
		counter1 = new Counter();
		// initialize the Counter here
	}
	
	@Test
	public void testDecrement() {
		assertEquals(-1, counter1.decrement());
	}
	
	@Test
	public void testIncrement() {
		assertEquals(1, counter1.increment());
		assertEquals(2, counter1.increment());
	}
}
