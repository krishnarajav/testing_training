package junit_pkg;

import java.util.HashMap;

public class product_hm {

	static HashMap<Integer, product_inv> p = new HashMap<Integer, product_inv>();
	static HashMap<Integer, product_inv> purchased = new HashMap<Integer, product_inv>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		product_inv p1 = new product_inv(101, "Samsung S24", 80000, "Samsung", 60);
		product_inv p2 = new product_inv(102, "Samsung S21", 60000, "Samsung", 30);
		product_inv p3 = new product_inv(103, "Samsung J2", 8000, "Samsung", 20);
		product_inv p4 = new product_inv(104, "Poco M2 Pro", 18000, "Poco", 80);
		product_inv p5 = new product_inv(105, "Poco GT", 25000, "Poco", 90);
		product_inv p6 = new product_inv(106, "Poco F3", 20000, "Poco", 60);
		product_inv p7 = new product_inv(107, "Nokia Asha", 5000, "Nokia", 20);
		product_inv p8 = new product_inv(108, "Nokia Lumia", 9000, "Nokia", 50);
		product_inv p9 = new product_inv(109, "Redmi Y2", 8000, "Redmi", 90);
		product_inv p10 = new product_inv(110, "T Shirt", 200, "Highlander", 60);
		
		p.put(p1.id, p1);
		p.put(p2.id, p2);
		p.put(p3.id, p3);
		p.put(p4.id, p4);
		p.put(p5.id, p5);
		p.put(p6.id, p6);
		p.put(p7.id, p7);
		p.put(p8.id, p8);
		p.put(p9.id, p9);
		p.put(p10.id, p10);
		
		//product_inv_func.display();

	}

}
