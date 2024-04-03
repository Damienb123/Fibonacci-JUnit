package Application;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FibonacciTest {
	static Fibonacci fib;
	
	//BeforeClass method
	@BeforeClass
	public static void init( ) {
		fib = new Fibonacci();
	}
	
	//Before method
	@Before
	public void prep() {
		fib.recursiveCallCount = 0;
	}
	
	//test method
	@Test
	public void testRecursiveFib6() {
		assertEquals(8, fib.recursiveFib(6));
		assertEquals(25, fib.recursiveCallCount);
	}
	
	//test method
	@Test
	public void testRecursveFib7() {
		assertEquals(13, fib.recursiveFib(7));
		assertEquals(41, fib.recursiveCallCount);
	}
	
	//Test method
	@Test
	public void testFib6() throws Exception {
		assertEquals(8, Fibonacci.fastFib(6));
	}
	
	//Test method
	@Test(expected = Exception.class)
	public void testFastFibNegative1() throws Exception {
		Fibonacci.fastFib(-1);
	}
}
