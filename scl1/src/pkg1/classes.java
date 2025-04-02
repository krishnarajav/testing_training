package pkg1;
 
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
 
public class classes {
	@Test
	public void test1()
	{
		 WebDriver dr = new ChromeDriver();
 
	        // Launch the URL
	    dr.get("https://demoqa.com/alerts");
		LocalDateTime myDateObj =LocalDateTime.now();
		DateTimeFormatter myFormatObj=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		String formatted=myDateObj.format(myFormatObj);
		System.out.println("in test - after formatting:"+formatted);
		
	}
 
	
	
 
}