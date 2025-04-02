package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class explicit_wait1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr = new ChromeDriver();
		dr.get("https://demowebshop.tricentis.com/books");
		WebDriverWait w = new WebDriverWait(dr, Duration.ofSeconds(2));
		WebElement ele = w.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[2]/div/div[2]/ul/li[1]/a/span")));
		ele.click();
	}

}
