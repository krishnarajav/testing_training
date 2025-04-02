package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample2 {
	static WebDriver dr = new ChromeDriver();
	static String xp1 = "//div[@class='inventory_list']/div[", xp3="]/div[2]//a/div", fullxp;
	static int num = 1;
	
	@BeforeClass 
	public void login() {
		dr.get("https://www.saucedemo.com");
		dr.findElement(By.id("user-name")).sendKeys("standard_user");
		dr.findElement(By.id("password")).sendKeys("secret_sauce");
		dr.findElement(By.id("login-button")).click();
	}
	
	@DataProvider(name = "checkdata")
	public Object[] getdata() {
		Object testdata[] = new Object[] {
				"Sauce Labs Backpack",
				"Sauce Labs Bike Light",
				"Sauce Labs Bolt T-Shirt",
				"Sauce Labs Fleece Jacket",
				"Sauce Labs Onesie",
				"Test.allTheThings() T-Shirt (Red)"
		};
		return testdata;
	}
	
	@Test(dataProvider = "checkdata")
	public void test_product_name(String epname) {
		fullxp=xp1+num+xp3;
		String pname=dr.findElement(By.xpath(fullxp)).getText();
		Assert.assertEquals(pname, epname);
		num++;
	}
}
