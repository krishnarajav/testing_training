package collections;

import java.util.ArrayList;

public class mobile_f1 {

	public static ArrayList<mobile> findbyBrand(ArrayList<mobile> m, String br) {
		ArrayList<mobile> x = new ArrayList<mobile>();
		for(mobile a : m) {
			if(a.brand.equals(br)) {
				x.add(a);
			}
		}
		return x;
	}
	
}
