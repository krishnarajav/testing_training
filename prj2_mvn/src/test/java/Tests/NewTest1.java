package Tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import POM_Pages.login_page;
import POM_Pages.products_page;
import Utilities.common_methods;

public class NewTest1 extends common_methods {
	login_page lp;
	products_page pp;
	static int r = 0;
	static Object[][] data;
	
	@BeforeClass
	public void bc() throws IOException {
		data = Utilities.common_methods.getdata();
	}
	
	@DataProvider(name = "logindata")
	public Object[][] senddata() {
		return data;
	}
	
	
	@BeforeMethod
	public void bm() {
		launch_chrome("https://www.saucedemo.com/");
		lp = new login_page(dr);
		pp = new products_page(dr);
	}
	
//	@AfterMethod
//	public void am() {
//		dr.close();
//	}
	
	@Test(dataProvider = "logindata")
	public void test1(String uid, String pwd) {
		lp.enter_uname(uid);
		lp.enter_pwd(pwd);
		lp.click_login();
		String atitle = pp.get_title();
		Assert.assertEquals("Products", atitle);
	}
}
