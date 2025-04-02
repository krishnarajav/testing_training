package junit_pkg;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class test_avg {
	private int ai, ds, ml, expected_op; 
	
	public test_avg(int ai, int ds, int ml, int expected_op) {
		this.ai = ai;
		this.ds = ds;
		this.ml = ml;
		this.expected_op = expected_op;
	}
	
	@Parameterized.Parameters
	public static List<Object[]> data() {
		System.out.println("in data method");
		Object b[][] = new Object[][] {
			{1, 2, 3, 2}, {5, 5, 5, 5}, {8, 7, 6, 7}, {7, 0, 0, 2}
		};
		List<Object[]> c = Arrays.asList(b);
		return c;
	}
	
	@Test
	public void test() {
		System.out.println("under test");
		assertEquals(expected_op, calc_avg.avg(ai, ds, ml));
	}

}
