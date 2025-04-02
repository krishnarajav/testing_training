package junit_pkg;

import java.sql.SQLException;
import java.util.Map.Entry;
import java.util.Scanner;

public class ticket_booking extends data_functions {
	private static Scanner sc = new Scanner(System.in);
	public static void displayroutes() {
		System.out.println("                     Bus Table                          ");
		System.out.println("========================================================");
		System.out.println("|RID|From|To|Remaining Seats|Cost|");
		System.out.println("========================================================");
		for(Entry<Integer, busroutes> e : hm1.entrySet()) {
			busroutes b = e.getValue();
			System.out.println("|" + e.getKey() + "|" + b.from + "|" + b.to + "|" + b.rseats + "|" + b.cost + "|");
		}
		System.out.println("========================================================");
		System.out.println();
	}
	
	public static void bookseat() throws ClassNotFoundException, SQLException {
		int rid, n;
		System.out.print("Enter the Route ID: ");
		rid = sc.nextInt();
		
		int i = 0;
		for(Entry<Integer, busroutes> b : hm1.entrySet()) {
			i++;
			if(b.getKey() == rid)
				break;
			else if(i == hm1.size()) {
				System.out.println("\nInvalid Input!");
				System.exit(0);
			}
			else 
				continue;
		}
		
		System.out.print("Enter the number of seats: ");
		n = sc.nextInt();
		int total = calc_amt(rid, n);
		int bid;
		if(hm1.isEmpty()) {
			bid = 1000;
		}
		else {
			bid = 1000 + hm2.size() + 1;
		}
		busbooking b = new busbooking(bid, rid, n, total);
		hm2.put(b.bookingid, b);
		System.out.println();
		data_functions.putdata(rid, n, bid);
	}
	
	public static int calc_amt(int rid, int n) {
		int total = 0;
		for(Entry<Integer, busroutes> x : hm1.entrySet()) {
			if(x.getKey() == rid) {
				busroutes b = x.getValue();
				total = b.cost * n;
				b.rseats = b.rseats - n;
			}
			else
				continue;
		}
		return total;
	}
}
