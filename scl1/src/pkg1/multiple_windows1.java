package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multiple_windows1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr = new ChromeDriver();
		dr.get("https://practice.expandtesting.com/windows");
		dr.manage().window().maximize();
		//String h = dr.getWindowHandle();
		dr.findElement(By.xpath("/html/body/main/div[3]/div/div[1]/a")).click();
		int i = 1;
		for(String s : dr.getWindowHandles()) {
			dr.switchTo().window(s);
			String title = dr.getTitle();
			System.out.println(i + " " + title);
			i++;
		}
	}

}
