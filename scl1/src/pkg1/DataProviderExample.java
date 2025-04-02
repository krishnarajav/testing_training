package pkg1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {
	@DataProvider(name = "logindata")
	public Object[][] getdata() {
		Object testdata[][] = {
				{"user1", "pwd1"},
				{"user2", "pwd2"},
				{"user3", "pwd3"},
				{"user4", "pwd4"}
		};
		return testdata;
	}
	
	@Test(dataProvider = "logindata")
	public void testlogin(String uid, String pwd) {
		System.out.println(uid + " " + pwd);
	}
}
