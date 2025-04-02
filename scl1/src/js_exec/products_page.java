package js_exec;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class products_page {
	WebDriver dr;
	
	@FindBy(xpath="//*[@id=\"header_container\"]/div[2]/span")
	WebElement title;
	
	public products_page(WebDriver dr) {
		this.dr = dr;
		PageFactory.initElements(dr, this);
	}
	
	public String get_title() {
		return title.getText();
	}
}
