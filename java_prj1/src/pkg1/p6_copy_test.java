package pkg1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class p6_copy_test {
		
		@Test
		public void test() {
			p6_copy p = new p6_copy();
			int n = 100;
			int x = p.sum_of_digit(n);
			System.out.println(x);
			assertEquals(0, x);
		}
		
		@Test
		public void test2() {
			p6_copy p = new p6_copy();
			int n = 100;
			int x = p.sum_of_digit(n);
			System.out.println(x);
			assertEquals(1, x);
		}
		
	
}
