package pkg1;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class assertions {
	@Test
	public void test1() {
		String s = "hello";
		Reporter.log("Expected" + s);
		Assert.assertEquals(true, true);
		System.out.println("in test1");
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(true, true);
		System.out.println("in test2");
	}
	
	@Test
	public void test3() {
		Assert.assertEquals(true, true);
		System.out.println("in test3");
	}
	
}
