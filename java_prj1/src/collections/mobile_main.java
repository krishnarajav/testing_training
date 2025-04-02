package collections;
import java.util.ArrayList;
public class mobile_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<mobile> m = new ArrayList<mobile>();
		
		m.add(new mobile("Samsung", "Galaxy S20", 80000.0f, 12));
		m.add(new mobile("Samsung", "Galaxy S21", 90000.0f, 12));
		m.add(new mobile("Poco", "M2 Pro", 9000.0f, 12));
		m.add(new mobile("Poco", "F2", 8000.0f, 12));
		m.add(new mobile("Realme", "18", 20000.0f, 12));
		m.add(new mobile("Redmi", "Note 5 Pro", 12000.0f, 4));
		m.add(new mobile("Redmi", "Note 6 Pro", 14000.0f, 6));
		m.add(new mobile("Nokia", "Asha", 6000.0f, 2));
		m.add(new mobile("Nokia", "Lumia", 8000.0f, 4));
		m.add(new mobile("Vivo", "V20", 12000.0f, 4));
		
		//Phones with Brand name "Samsung"
		System.out.println("Phones with Brand name \"Samsung\":\n");
		String brand = "Samsung";
		ArrayList<mobile> s = mobile_f1.findbyBrand(m, brand);
		for(mobile x : s) {
			System.out.println("Brand: " + x.brand + ", Model: " + x.model + ", Price: Rs. " + x.price + ", RAM: " + x.ram + "GB");
		}
		System.out.println("========================================================================");
		
		//Phones priced between Rs. 15000 & Rs. 20000
		System.out.println("Phones priced between Rs. 15000 & Rs. 20000:\n");
		s.clear();
		float ll = 15000.0f, ul = 20000.0f;
		s = mobile_f2.dispaly_mobile_details(ll, ul, m);
		for(mobile x : s) {
			System.out.println("Brand: " + x.brand + ", Model: " + x.model + ", Price: Rs. " + x.price + ", RAM: " + x.ram + "GB");
		}
		System.out.println("========================================================================");
		
		//Phones with RAM > 6GB & price < Rs. 10000
		System.out.println("Phones with RAM > 6GB & price < Rs. 10000:\n");
		s.clear();
		int ram = 6;
		float price = 10000.0f;
		s = mobile_f3.dispaly_mobile_details(ram, price, m);
		for(mobile x : s) {
			System.out.println("Brand: " + x.brand + ", Model: " + x.model + ", Price: Rs. " + x.price + ", RAM: " + x.ram + "GB");
		}
	}

}
