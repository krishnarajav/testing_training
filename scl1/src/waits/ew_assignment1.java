package waits;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ew_assignment1 {

	public static void main(String[] args) {
		WebDriver dr = new ChromeDriver();
		dr.get("https://the-internet.herokuapp.com/dynamic_controls");
		dr.findElement(By.xpath("//form[@id='checkbox-example']/button[@type='button']")).click();
		WebDriverWait w = new WebDriverWait(dr, Duration.ofSeconds(5));
		WebElement ele = w.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"checkbox-example\"]/button")));
		ele.click();
		boolean appeared = false;
		ele = w.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"checkbox\"]")));
		appeared = dr.findElement(By.xpath("//*[@id=\"checkbox\"]")).isDisplayed();
		if(appeared == true) {
			System.out.println("appeared");
		}
		else
			System.out.println("not appeared");
	}

}
