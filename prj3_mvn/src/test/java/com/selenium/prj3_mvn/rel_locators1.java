package com.selenium.prj3_mvn;

import org.openqa.selenium.By;
import org.openqa.selenium.support.locators.RelativeLocator;

public class rel_locators1 extends Utilities.common_methods {

	public static void main(String[] args) {
		launch_chrome("https://www.saucedemo.com");
		
		By emaillocator = RelativeLocator.with(By.tagName("input")).above(By.id("password"));
		dr.findElement(emaillocator).sendKeys("standard_user");
		
		By passwdlocator = RelativeLocator.with(By.tagName("input")).below(By.id("user-name"));
		dr.findElement(passwdlocator).sendKeys("secret_user");
	}	

}
