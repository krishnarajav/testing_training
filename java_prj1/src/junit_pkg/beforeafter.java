package junit_pkg;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class beforeafter {

	@BeforeClass
	public static void beforeclass() {
		System.out.println("in beforeclass");
	}
	
	@AfterClass
	public static void afterclass() {
		System.out.println("in afterclass");
	}
	
	@Before
	public void setup() {
		System.out.println("in setup");
	}
	
	@After
	public void teardown() {
		System.out.println("in teardown");
	}
	
	@Test
	public void test1() {
		System.out.println("in test1");
	}
	
	@Test
	public void test2() {
		System.out.println("in test2");
	}

}
