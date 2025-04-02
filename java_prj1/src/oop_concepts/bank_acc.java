package oop_concepts;

public class bank_acc {

	int acc_no;
	String acc_name;
	float balance;
	
	public void deposit(float amt) {
		balance += amt;
		System.out.println(acc_name + ": Deposit of " + amt + " successful");
	}
	
	public void withdraw(float amt) {
		balance -= amt;
		System.out.println(acc_name + ": Deposit of " + amt + " successful");
	}
	
	public bank_acc(int acc_no, String acc_name, float balance) {
		this.acc_no = acc_no;
		this.acc_name = acc_name;
		this.balance = balance;
	}

	public void show_details()
	{	
		System.out.println("===========================================================");
		System.out.println("Account No: "+ acc_no + "\nAccount Name: "+ acc_name + "\nAccount balance: "+ balance);
		System.out.println("===========================================================");
	}
	
}
