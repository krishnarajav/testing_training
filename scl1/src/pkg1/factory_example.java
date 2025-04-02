package pkg1;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class factory_example {
	private String b;
	public factory_example(String b) {
		this.b = b;
	}
	
	@Test 
	public void testMethod() {
		System.out.println("Running " + b);
	}
	
	@Factory
	public static Object[] factoryMethod() {
		Object[] o = {
				new factory_example("Chrome"),
				new factory_example("Firefox"),
				new factory_example("Edge"),
		};
		return o;
	}

}
