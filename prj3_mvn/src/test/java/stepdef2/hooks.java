package stepdef2;

import io.cucumber.java.Before;

public class hooks extends Utilities.common_methods {
	
	@Before
	public void setup() {
		System.out.println("Before hook");
		launch_chrome("https://demowebshop.tricentis.com/");
	}
	
}
