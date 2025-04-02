package pkg1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependency1 {
	@Test
	public void login() {
		System.out.println("In login method");
		Assert.assertEquals(true, true);
	}
	
	@Test(dependsOnMethods = "login")
	public void verifyDashboard() {
		System.out.println("dashboard verification passed");
	}
}
