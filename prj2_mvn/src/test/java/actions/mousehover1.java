package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousehover1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver dr = new EdgeDriver();
		dr.get("https://www.myntra.com");
		dr.manage().window().maximize();
		
		WebElement menu = dr.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[2]/div/div[1]/span[1]"));
		
		Actions act = new Actions(dr);
		act.moveToElement(menu).perform();
	}
}
