package junit_pkg;

import static org.junit.Assert.*;

import org.junit.Test;

public class timeout_test {

	@Test(timeout=1500)
	public void test() throws InterruptedException {
		Thread.sleep(1000);
	}

}
