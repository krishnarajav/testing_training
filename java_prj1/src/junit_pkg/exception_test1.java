package junit_pkg;

import static org.junit.Assert.*;

import org.junit.Test;

public class exception_test1 {

	@Test(expected = ArithmeticException.class)
	public void test1() {
		int a = 1 / 0;
	}

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void test2() {
		int arr[] = new int[4];
		arr[4] = 10;
	}
}
