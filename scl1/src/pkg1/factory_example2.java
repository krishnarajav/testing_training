package pkg1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class factory_example2 {
	public String b;
	static WebDriver dr;
	public factory_example2(String b) {
		this.b = b;
	}
	
	@Test 
	public void testMethod() {
		switch(b) {
			case "Chrome":
				dr = new ChromeDriver();
				dr.get("https://www.saucedemo.com");
				break;
			case "Edge":
				dr = new EdgeDriver();
				dr.get("https://www.saucedemo.com");
				break;
			case "Firefox":
				dr = new FirefoxDriver();
				dr.get("https://www.saucedemo.com");
				break;
		}
	}
	
	@Factory
	public static Object[] factoryMethod() {
		Object[] o = {
				new factory_example2("Chrome"),
				new factory_example2("Edge"),
				new factory_example2("Firefox"),
		};
		return o;
	}
	
	@AfterMethod
	public void am() {
		dr.findElement(By.id("user-name")).sendKeys("standard_user");
		dr.findElement(By.id("password")).sendKeys("secret_sauce");
		dr.findElement(By.id("login-button")).click();
	}

}
