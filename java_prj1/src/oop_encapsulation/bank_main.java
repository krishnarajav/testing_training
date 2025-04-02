package oop_encapsulation;

public class bank_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank_account acc1 = new bank_account();
		acc1.setAcc_no(1122);
		acc1.setAcc_name("Sachin");
		System.out.println("Account No: " + acc1.getAcc_no() + "\nAccount Name: " + acc1.getAcc_name());
	}

}
