package stepdef2;

import org.openqa.selenium.By;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class demowebshoplogin extends Utilities.common_methods {
	@Given("Login page is displayed") 
	public void login_page_is_displayed() {
		dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click(); 
	}
	  
	@When("User enters valid username and password") 
	public void user_enters_valid_username_and_password() {
		dr.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("zxc420@gmail.com");
		dr.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("aaaaaa"); 
	}
	
	@When("User clicks login button") 
	public void user_clicks_login_button() {
		dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click(); 
	}
	
	@Then("User successfully logs in") 
	public void user_successfully_logs_in_to_products_page() { 
		String s = dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).getText();
		Assert.assertEquals("zxc420@gmail.com", s); 
	}
	
}
