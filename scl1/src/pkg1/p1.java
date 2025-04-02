package pkg1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class p1 {

	public static void main(String[] args) {
		WebDriver dr = new ChromeDriver();
		dr.get("https://www.flipkart.com");
	}
}
