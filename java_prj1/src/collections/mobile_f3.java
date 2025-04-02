package collections;

import java.util.ArrayList;

public class mobile_f3 {

	public static ArrayList<mobile> dispaly_mobile_details(int ram, float price, ArrayList<mobile> m) {
		ArrayList<mobile> x = new ArrayList<mobile>();
		for(mobile a : m) {
			if(a.ram >= 6 && a.price < 10000.0f) {
				x.add(a);
			}
		}
		return x;
	}
	
}
