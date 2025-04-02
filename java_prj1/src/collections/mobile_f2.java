package collections;

import java.util.ArrayList;

public class mobile_f2 {
	
	public static ArrayList<mobile> dispaly_mobile_details(float ll, float ul, ArrayList<mobile> m) {
		ArrayList<mobile> x = new ArrayList<mobile>();
		for(mobile a : m) {
			if(a.price >= 15000.0f && a.price <= 20000.0f) {
				x.add(a);
			}
		}
		return x;
	}
	
}
