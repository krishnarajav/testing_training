package stepdef;

import org.openqa.selenium.By;
import org.testng.Assert;

import Pages.login_page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class saucedemo_login extends Utilities.base_class {
	login_page l;
	
	@Given("Login page is displayed")
	public void login_page_is_displayed() {
		launch_chrome("https://www.saucedemo.com");
	}
	
	@When("User enters valid username and password")
	public void user_enters_valid_username_and_password() {
		l = new login_page(dr);
		l.enter_uname("standard_user");
		l.enter_pwd("secret_sauce");
	}
	
	@When("User clicks login button")
	public void user_clicks_login_button() {
		l.click_login();
	}
	
	@Then("User successfully logs into Products page")
	public void user_successfully_logs_into_products_page() {
		String s = dr.findElement(By.xpath("//span[@class='title']")).getText();
		Assert.assertEquals(s, "Products");
	}
	
}
