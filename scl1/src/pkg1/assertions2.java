package pkg1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assertions2 {
	SoftAssert sa;
	
	@Test
	public void test1() {
		sa = new SoftAssert();
		sa.assertEquals(false, true);
		System.out.println("in test1");
		sa.assertAll();
	}
	
	@Test
	public void test2() {
		sa.assertEquals(true, true);
		System.out.println("in test2");
		sa.assertAll();
	}
	
	@Test
	public void test3() {
		sa.assertEquals(false, false);
		System.out.println("in test3");
		sa.assertAll();
	}
}
