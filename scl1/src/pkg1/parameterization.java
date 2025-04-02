package pkg1;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parameterization {
	@Test
	@Parameters({ "OS" })
	public void test(String OS) {
		System.out.println("Running test on Os " + OS);
	}

}