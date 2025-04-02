package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class p3 {

	public static void main(String[] args) {
		WebDriver dr = new ChromeDriver();
		dr.get("https://demowebshop.tricentis.com/");
		
//		dr.findElement(By.linkText("Register")).click();
//		dr.findElement(By.id("gender-male")).click();
//		dr.findElement(By.id("FirstName")).sendKeys("Abc");
//		dr.findElement(By.id("LastName")).sendKeys("Xyz");
//		dr.findElement(By.id("Email")).sendKeys("qwerty562@gmail.com");
//		dr.findElement(By.id("Password")).sendKeys("aaaaaa");
//		dr.findElement(By.id("ConfirmPassword")).sendKeys("aaaaaa");
//		dr.findElement(By.id("register-button")).click();
//		dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[2]/input")).click();
//		dr.findElement(By.id("pollanswers-1")).click();
//		dr.findElement(By.id("vote-poll-1")).click();
		//dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[3]/div/div/div[3]/div[3]/div/div[2]/div[3]/div[2]/input")).click();
		dr.findElement(By.linkText("Log in")).click();
		dr.findElement(By.id("Email")).sendKeys("qwerty562@gmail.com");
		dr.findElement(By.id("Password")).sendKeys("aaaaaa");
		dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
		dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ul/li[1]/a")).click();
		WebElement w1 = dr.findElement(By.name("products-orderby"));
		Select sel = new Select(w1);
		sel.selectByContainsVisibleText("Name: A");

	}

}
