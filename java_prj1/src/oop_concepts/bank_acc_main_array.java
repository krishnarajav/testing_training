package oop_concepts;

public class bank_acc_main_array {
	
	public static void main(String args[]) {
		bank_acc user[] = new bank_acc[3];
//		user[0].acc_name="Priya";
//		user[0].acc_no=1234;
//		user[0].balance=5000;
		
		user[0] = new bank_acc(1234, "Priya", 5000);
		
		user[0].show_details();
		user[0].deposit(1000);
		user[0].show_details();
		user[0].withdraw(2000);
		user[0].show_details();
	}
}
