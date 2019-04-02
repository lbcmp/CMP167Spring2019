import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.After;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalcTest {
	
	/*
	 * You have to import the Before and After things
	 * import org.junit.Before;
	 * import org.junit.After;
	 */
	
	@BeforeClass
	public static void greet() {
	System.out.println("Before Everything");
	}
	
	@Before
	public void beforeMethod() {
		System.out.println("Before each test");
		}
	
	@After
	public void afterMethod() {
		System.out.println("After each test");
		}
	
	@Test
	public void test1() {
		assertEquals(0, Calculate.multiply(0, 1));
		System.out.println("Test 1");
	}
	
	@Test
	public void test2() {
		assertEquals(1, Calculate.multiply(1, 1));
		System.out.println("Test 2");
	}
	
	@Test
	public void test3() {
		assertEquals(2.0, Calculate.multiply(2.0, 1.0), 0.0001);
		System.out.println("Test 3");
	}
	
	
	
}
