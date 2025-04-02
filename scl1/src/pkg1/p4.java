package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p4 {
	public static void main(String[] args) {
		WebDriver dr = new ChromeDriver();
		dr.get("https://jqueryui.com/");
		dr.findElement(By.linkText("Checkboxradio")).click();
		WebElement w1 = dr.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
		dr.switchTo().frame(w1);
		dr.findElement(By.xpath("//label[@for=\"checkbox-2\"]")).click();
	}
}
