package junit_pkg;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class newtest1 {
		@BeforeClass
		public void beforeclass() {
			System.out.println("in beforeclass");
		}
		
		@AfterClass
		public void afterclass() {
			System.out.println("in afterclass");
		}
		
		@BeforeMethod
		public void bm() {
			System.out.println("in setup");
		}
		
		@AfterMethod
		public void teardown() {
			System.out.println("in teardown");
		}
		
		@Test
		public void test1() {
			System.out.println("in test1");
		}
		
		@Test
		public void test2() {
			System.out.println("in test2");
		}

}

	
	
	
	

