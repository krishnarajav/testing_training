package junit_pkg;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class calc_avg1 {
	static int[][] b = new int[][] {
		{1, 2, 3, 2}, {5, 5, 5, 5}, {7, 0, 0, 2}
	};
	
	static int[] l;
	static int[] p;
	static int[] q;
	
	@Before
	public void setup() {
		l = b[0];
		p = b[1];
		q = b[2];
	}
	
	@Test
	public void test1() {
		System.out.println("ai: " + l[0] + " ds: " + l[1] + " ml: " + l[2] + " expected_op: " + l[3]);
		assertEquals(2, calc_avg.avg(l[0], l[1], l[2]));
		System.out.println("actual res: " + calc_avg.avg(l[0], l[1], l[2]));
	}
	
	@Test
	public void test2() {
		System.out.println("ai: " + p[0] + " ds: " + p[1] + " ml: " + p[2] + " expected_op: " + p[3]);
		assertEquals(5, calc_avg.avg(p[0], p[1], p[2]));
		System.out.println("actual res: " + calc_avg.avg(p[0], p[1], p[2]));
	}

	@Test
	public void test3() {
		System.out.println("ai: " + q[0] + " ds: " + q[1] + " ml: " + q[2] + " expected_op: " + q[3]);
		assertEquals(2, calc_avg.avg(q[0], q[1], q[2]));
		System.out.println("actual res: " + calc_avg.avg(q[0], q[1], q[2]));
	}
	
}
