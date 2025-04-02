package oop_concepts;

public class bank_array_objects {

	public static void main(String args[]) {
		bank_acc user[] = new bank_acc[3];
		
		user[0] = new bank_acc(1234, "Priya", 5000);
		user[1] = new bank_acc(1235, "Lokesh", 5000);
		user[2] = new bank_acc(1236, "Rajesh", 5000);
		
		user[0].show_details();
		user[1].show_details();
		user[2].show_details();
		
	}
	
}
