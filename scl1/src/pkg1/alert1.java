package pkg1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert1 {
	static WebDriver dr = new ChromeDriver();
	public static void main(String[] args) {
		Launch_chrome("https://demoqa.com/alerts");
		WebElement e = dr.findElement(By.xpath("//*[@id=\"alertButton\"]"));
		e.click();
		
		try {
			Thread.sleep(1000);
		}
		catch(InterruptedException e1) {
			e1.printStackTrace();
		}
		Alert a = dr.switchTo().alert();
		String alert_msg = a.getText();
		System.out.println("Alert Message : " + alert_msg);
		a.accept();
	}

	private static void Launch_chrome(String string) {
		dr.get(string);
		dr.manage().window().maximize();
	}

}
