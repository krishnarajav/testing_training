package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ew_assignment2 {

	public static void main(String[] args) {
		WebDriver dr = new ChromeDriver();
		dr.get("https://the-internet.herokuapp.com/dynamic_controls");
		dr.findElement(By.xpath("//*[@id=\"input-example\"]/button")).click();
		WebDriverWait w = new WebDriverWait(dr, Duration.ofSeconds(5));
		WebElement ele = w.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"input-example\"]/input")));
		ele.sendKeys("abcd");
		dr.quit();
	}

}
