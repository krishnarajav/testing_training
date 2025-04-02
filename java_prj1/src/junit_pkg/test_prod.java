package junit_pkg;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

public class test_prod {

	static product_inv_func t = new product_inv_func();
	final HashMap<Integer, product_inv> test_total = new HashMap<Integer, product_inv>();
	product_inv p1 = new product_inv(101, "Samsung S24", 80000, "Samsung", 2);
	product_inv p2 = new product_inv(102, "Samsung S21", 60000, "Samsung", 1);
	static int total;
	
	@Test
	public void test_total() {
		test_total.put(p1.id, p1);
		test_total.put(p2.id, p2);
		total = t.calc_total(test_total);
		assertEquals(220000, total);
	}
	
	@Test
	public void test_disc() {
		test_total.put(p1.id, p1);
		test_total.put(p2.id, p2);
		total = t.calc_total(test_total);
		int disc = t.calc_disc(total);
		assertEquals(44000, disc);
	}
	
}
