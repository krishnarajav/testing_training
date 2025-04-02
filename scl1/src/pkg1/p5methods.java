package pkg1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p5methods {
	public static void val_login() {
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.saucedemo.com/");
		
		dr.findElement(By.id("user-name")).sendKeys("standard_user");
		dr.findElement(By.id("password")).sendKeys("secret_sauce");
		dr.findElement(By.id("login-button")).click();
		
		String s = dr.findElement(By.xpath("//span[@class='title']")).getText();
		 
		if(s.equals("Products"))
			System.out.println("Pass");
		else
			System.out.println("Fail");
	}	
		
	public static void inval_login() {
	    WebDriver dr = new ChromeDriver();
	    dr.get("https://www.saucedemo.com/");
	    
	    dr.findElement(By.id("user-name")).sendKeys("standard_user");
	    dr.findElement(By.id("password")).sendKeys("secret_sausage");
	    dr.findElement(By.id("login-button")).click();
	    
	    String s = dr.findElement(By.xpath("//*[@id='login_button_container']/div/form/div[3]/h3")).getText();
	    if(s.equals("Epic sadface: Username and password do not match any user in this service"))
	        System.out.println("Pass");
	    else
	        System.out.println("Fail");
	}
}
