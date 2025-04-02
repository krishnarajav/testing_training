package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class base_class {
	public static WebDriver dr;
	public static void launch_chrome(String url) {
		dr = new ChromeDriver();
		dr.get(url);
		dr.manage().window().maximize();
	}
	
	public static void launch_edge(String url) {
		System.setProperty("webdriver.edge.driver", "asedgedriver_v133.exe");
		dr = new EdgeDriver();
		dr.get(url);
		dr.manage().window().maximize();
	}

}
