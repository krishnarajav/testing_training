package junit_pkg;

import java.util.Map.Entry;
import java.util.HashMap;

public class product_inv_func extends product_hm {

	public int calc_total(HashMap<Integer, product_inv> test_total) {
		int total = 0, t = 0; 
		for(Entry<Integer, product_inv> pro : test_total.entrySet()) {
			product_inv x = pro.getValue();
			t = (x.price * x.quantity);
			total = total + t;
		}
		return total;
	}
		
	public int calc_disc(int total) {
		//20% disc
		float discount1 = 0.0f;
		if(total >= 25000) {
			discount1 = total * 0.2f;
		}
	
		//10% disc
		float discount2 = 0.0f;
		if(total>=15000 && total <= 25000) {
			discount2 = total * 0.1f;
		}
		
		//disc for tshirts
		float spldisc = 0.0f;
		for(Entry<Integer, product_inv> billprod : purchased.entrySet()) {
			product_inv x = billprod.getValue();
			if(billprod.getKey() == 110 && x.quantity >= 3) {
				spldisc = total * 0.1f;
			}
		}
		
		int td = (int) discount1 + (int) discount2 + (int) spldisc;
		
		return td;
	}
	
	public int grand_total(int total, int td) {
		int g_total = total - td;
		return g_total;
	}
	
	public void purchase(int pid, int q) {
		for(Entry<Integer, product_inv> pro : p.entrySet()) {
			product_inv x = pro.getValue();
			if(pro.getKey() == pid) {
				x.quantity = x.quantity - q;
			}
			else
				continue;
		}
	}
}
