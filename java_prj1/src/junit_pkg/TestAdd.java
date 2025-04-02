package junit_pkg;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAdd {

	@Test
	public void test1() {
		add_num obj = new add_num();
		int i, j;
		i = j = 11;
		System.err.println("In TestAdd1");
		assertEquals(i+i, obj.sum(i, j));
	}
	
	@Test
	public void test2() {
		add_num obj = new add_num();
		System.err.println("In TestAdd2");
		assertEquals(15, obj.sum(0, 15));
	}

}
