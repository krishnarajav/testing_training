package stepdef2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class cart1 extends Utilities.common_methods {
	demowebshoplogin ob = new demowebshoplogin();
	static String s1, rItem_desc, removing_item_cost, total, sprice, stotal1, quantity, order_id, order_detail;
	
	@Given("User is logged in")
	public void user_is_logged_in() {
		ob.login_page_is_displayed();
		ob.user_enters_valid_username_and_password();
		ob.user_clicks_login_button();
		ob.user_successfully_logs_in_to_products_page();
	}
	
//	@When("User adds a product to cart")
//	public void user_adds_a_product_to_cart() {
//		dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[3]/div/div/div[3]/div[3]/div/div[2]/h2/a")).click();
//		s1 = dr.findElement(By.xpath("//*[@id=\"product-details-form\"]/div/div[1]/div[2]/div[1]")).getText();
//		dr.findElement(By.xpath("//*[@id=\"add-to-cart-button-31\"]")).click();
//	}
//	
//	@Then("Cart contains the same product added to cart")
//	public void cart_contains_the_same_product_added_to_cart() {
//		dr.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[3]/ul/li[4]/a")).click();
//		String s2 = dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr/td[3]/a")).getText();
//		Assert.assertEquals(s2, s1);
//	}

	
	
	
	
	
	@When("User adds multiple products to cart")
	public void user_adds_multiple_products_to_cart() {
		dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[3]/div/div/div[3]/div[3]/div/div[2]/h2/a")).click();
		dr.findElement(By.xpath("//*[@id=\"add-to-cart-button-31\"]")).click();
		dr.navigate().back();
		dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[3]/div/div/div[3]/div[4]/div/div[2]/h2/a")).click();
		dr.findElement(By.xpath("//*[@id=\"add-to-cart-button-72\"]")).click();
		dr.navigate().back();
		dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[3]/div/div/div[3]/div[6]/div/div[2]/h2/a")).click();
		dr.findElement(By.xpath("//*[@id=\"add-to-cart-button-74\"]")).click();
		dr.navigate().back();
	}
	
	@When("User removes one product from cart")
	public void user_removes_one_product_from_cart() {
		dr.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[3]/ul/li[4]/a")).click();
		rItem_desc = dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr[3]")).getText();
		removing_item_cost = dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr[3]/td[6]/span[2]")).getText();
		total = dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/div[2]/div[2]/div[1]/table/tbody/tr[4]/td[2]/span")).getText();
		dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr[3]/td[1]/input")).click();
		dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/div[1]/div/input[1]")).click();
	}
	
	@Then("Cart is updated with items as well as total amount")
	public void cart_is_updated_with_items_as_well_as_total_amount() {
		Assert.assertEquals(dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr[3]/td[6]/span[2]")).isDisplayed(), false);
		String updated_total = dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/div[2]/div[2]/div[1]/table/tbody/tr[4]/td[2]/span/span")).getText();
		Assert.assertEquals(Double.parseDouble(total) - Double.parseDouble(removing_item_cost), Double.parseDouble(updated_total));
	}

	
	
	
	
//	@When("User adds a product to cart and updates quantity")
//	public void user_adds_a_product_to_cart_and_updates_quantity() {
//		dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[3]/div/div/div[3]/div[3]/div/div[2]/div[3]/div[2]/input")).click();
//		dr.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[3]/ul/li[4]/a")).click();
//		sprice = dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr/td[4]/span[2]")).getText();
//		quantity = dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr/td[5]/input")).getDomAttribute("value");
//		stotal1 = dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr/td[6]/span[2]")).getText();
//		Assert.assertEquals(Double.parseDouble(sprice) * Double.parseDouble(quantity), Double.parseDouble(stotal1));
//		dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr/td[5]/input")).click();
//		dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr/td[5]/input")).clear();
//		dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr/td[5]/input")).sendKeys("2");
//		dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/div[1]/div/input[1]")).click();
//	}
//
//	@Then("Cart gets updated with the product specific total and grand total")
//	public void cart_gets_updated_with_the_product_specific_total_and_grand_total() {
//		sprice = dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr/td[4]/span[2]")).getText();
//		quantity = dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr/td[5]/input")).getDomAttribute("value");
//		stotal1 = dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr/td[6]/span[2]")).getText();
//		Assert.assertEquals(Double.parseDouble(sprice) * Double.parseDouble(quantity), Double.parseDouble(stotal1));
//	}

	
	
	
	
//	@When("User confirms the order")
//	public void user_confirms_the_order() {
//		dr.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[3]/ul/li[4]/a")).click();
//		dr.findElement(By.xpath("//*[@id=\"termsofservice\"]")).click();
//		dr.findElement(By.xpath("//*[@id=\"checkout\"]")).click();
//		dr.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/input")).click();
//		WebDriverWait w = new WebDriverWait(dr, Duration.ofSeconds(2));
//		WebElement ele = w.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"shipping-address-select\"]")));
//		ele.click();
//		dr.findElement(By.xpath("//*[@id=\"shipping-address-select\"]/option[1]")).click();
//		dr.findElement(By.xpath("//*[@id=\"PickUpInStore\"]")).click();
//		dr.findElement(By.xpath("//*[@id=\"shipping-buttons-container\"]/input")).click();
//		ele = w.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"payment-method-buttons-container\"]/input")));
//		ele.click();
//		ele = w.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"payment-info-buttons-container\"]/input")));
//		ele.click();
//		ele = w.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"confirm-order-buttons-container\"]/input")));
//		ele.click();
//		ele = w.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/div[2]/input")));
//		order_id = dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/ul/li[1]")).getText();
//		ele.click();
//	}
//	
//	@Then("Order places successfully and My Account - Order contains the order number")
//	public void order_places_successfully_and_my_account_order_contains_the_order_number() {
//		dr.findElement(By.xpath("/html/body/div[4]/div[2]/div[1]/div[3]/ul/li[2]/a")).click();
//		order_detail = dr.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div/div[1]/div[1]/strong")).getText();
//		Assert.assertEquals(order_id.substring(14, order_id.length()), order_detail.substring(14, order_detail.length()));
//	}
}
