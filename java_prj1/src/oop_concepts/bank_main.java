package oop_concepts;

public class bank_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank_acc user = new bank_acc(1234, "Satish", 5000);
		user.show_details();
		user.deposit(1000);
		user.show_details();
		user.withdraw(2000);
		user.show_details();
	}

}
