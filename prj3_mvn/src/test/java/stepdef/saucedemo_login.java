package stepdef;

import org.openqa.selenium.By;
import org.testng.Assert;

import Utilities.ScenarioContext;
import Utilities.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class saucedemo_login extends Utilities.common_methods {
	static TestContext tContext = new TestContext();
	
	@Given("Login page is displayed")
	public void login_page_is_displayed() {
		launch_chrome("https://www.saucedemo.com");
	}
	
	@When("User clicks login button")
	public void click_on_the_login_button() {
		dr.findElement(By.id("login-button")).click();
	}
	
	
	
	@When("User enters valid username and password")
	public void user_enters_valid_and() {
		dr.findElement(By.id("user-name")).sendKeys("standard_user");
		dr.findElement(By.id("password")).sendKeys("secret_sauce");
	}
	
	@Then("User successfully logs into Products page")
	public void User_successfully_logs_into_Products_page() {
		String s = dr.findElement(By.xpath("//span[@class='title']")).getText();
		Assert.assertEquals(s, "Products"); 
	}
	
	
	
	
	@When("User enters invalid username and password")
	public void User_enters_invalid_username_and_password() {
		dr.findElement(By.id("user-name")).sendKeys("standard_user");
		dr.findElement(By.id("password")).sendKeys("secret");
	}
	
	@Then("User cannot login and error message is displayed")
	public void User_cannot_login_and_error_message_is_displayed() {
		String s = dr.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).getText();
		Assert.assertEquals(s, "Epic sadface: Username and password do not match any user in this service"); 
	}
	
	
	
//	@When("^user  enters valid \"(.*)\" and \"(.*)\"$")
//	public void user_enters_valid_and(String string1, String string2) {
//		dr.findElement(By.id("user-name")).sendKeys(string1);
//		dr.findElement(By.id("password")).sendKeys(string2);
//	}
// 
//	@Then("user successfully logs into the products paGE  and the application should display {string}")
//	public void user_successfully_logs_into_the_products_pa_ge_and_the_application_should_display(String string) {
//	    // Write code here that turns the phrase above into concrete actions
//		String s=dr.findElement(By.xpath("//span[@class='title']")).getText();
//		Assert.assertEquals("Products",s); 
//	}
	
	
	
	
	
	@When("User enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_and(String uid, String pwd) {
		System.out.println("User enters valid uname and pwd");
		tContext.set(ScenarioContext.USERNAME.toString(), uid);
		tContext.set(ScenarioContext.SESSION_TOKEN.toString(), "asd789");
	}
	

	@Then("User session should be available")
	public void u_ser_session_should_be_available() {
		String storeuid = (String) tContext.get(ScenarioContext.USERNAME.toString());
		String sessionToken = (String) tContext.get(ScenarioContext.SESSION_TOKEN.toString());
		System.out.println(storeuid + " " + sessionToken);
	}

}
