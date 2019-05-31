package br.ufrgs.inf.tcp.junit.counter;

public class Counter {
	int count = 0;
	
	public int increment() {
		return count += 1;
	}
	public int decrement() {
		return count -= 1;
	}
	
	public int getCount() {
		return count;
	}
}
