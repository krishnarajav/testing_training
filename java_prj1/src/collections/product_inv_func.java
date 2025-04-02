package collections;

import java.util.Map.Entry;
import java.util.Scanner;

public class product_inv_func extends product_hm {
	static Scanner scan = new Scanner(System.in);
	
	public static void display() {
		System.out.println("=========================================================================================");
		System.out.println("| Product ID |       Product Name       | Available Units | Unit Price  |     Brand     |");
		System.out.println("=========================================================================================");
		for(Entry<Integer, product_inv> pro : p.entrySet()) {
			product_inv x = pro.getValue();
			System.out.println(String.format("|%7d     |   %-19s    |%8d         |%8d     |    %-11s|", pro.getKey(), x.name, x.quantity, x.price, x.brand));
		}
		System.out.println("|    111     |                                 Exit                                     |");
		System.out.println("=========================================================================================");
		
		int pid, q;
		while(true) {
			System.out.println("Enter the product id you want to purchase: ");
			pid = scan.nextInt();
			if(pid == 111)
				break;
			System.out.println("Enter the number of units you want to purchase: ");
			q = scan.nextInt();
			purchase(pid, q);
		} 
		
		
		System.out.println();
		System.out.println();
		System.out.println("                              Billing                                   ");
		System.out.println("========================================================================");
		System.out.println("|       Product Name       | Unit Price  |     Qty     |     Total     |");
		System.out.println("------------------------------------------------------------------------");
		int total = 0; 
		for(Entry<Integer, product_inv> pro : purchased.entrySet()) {
			product_inv x = pro.getValue();
			total = total + (x.price *x.quantity);
			System.out.println(String.format("|   %-19s    |%8d     |%8d     |    %11d|", x.name, x.price, x.quantity, (x.quantity * x.price)));
		}
		
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
		
		total = total - td;
		
		System.out.println("------------------------------------------------------------------------");
		System.out.println(String.format("|Total Discount%56d|", td));
		System.out.println("========================================================================");
		System.out.println(String.format("|Final Amount%58d|", total));
		System.out.println("========================================================================");
		
		
		
		System.out.println("\n\n\n\n\n");
		System.out.println("| Product ID |       Product Name       | Available Units | Unit Price  |     Brand     |");
		System.out.println("=========================================================================================");
		for(Entry<Integer, product_inv> pro : p.entrySet()) {
			product_inv x = pro.getValue();
			System.out.println(String.format("|%7d     |   %-19s    |%8d         |%8d     |    %-11s|", pro.getKey(), x.name, x.quantity, x.price, x.brand));
		}
		System.out.println("=========================================================================================");
	}
	
	public static void purchase(int pid, int q) {
		for(Entry<Integer, product_inv> pro : p.entrySet()) {
			product_inv x = pro.getValue();
			if(pro.getKey() == pid) {
				x.quantity = x.quantity - q;
			}
			else
				continue;
			product_inv newP = new product_inv(pid, x.name, x.price, x.brand, q);
			purchased.put(newP.id, newP);
		}
	}
}
