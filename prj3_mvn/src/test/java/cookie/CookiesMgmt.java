package cookie;

import org.openqa.selenium.Cookie;

public class CookiesMgmt extends Utilities.common_methods {

	public static void addCookie(String cname, String cvalue) {
		Cookie c = new Cookie(cname, cvalue);
		dr.manage().addCookie(c);
	}
	
	public static void display_cookie() {
		for(Cookie c: dr.manage().getCookies()) {
			System.out.println(c.getName() + " " + c.getValue());
		}
	}
	
	public static void delete_cookie(String cname) {
		dr.manage().deleteCookieNamed(cname);	
	}
	
	public static void main(String[] args) {
		launch_chrome("https://www.flipkart.com/");
		addCookie("UserSession", "123456");
		addCookie("Place", "Bangalore");
		addCookie("Page","Products page");
		display_cookie();
		delete_cookie("Place");
		if (dr.manage().getCookieNamed("Place")==null)
			System.out.println("TESTCOOKIE SUCCESSFULLY DELETED");
		else
			System.out.println("NOT DELETED");

	}

}
