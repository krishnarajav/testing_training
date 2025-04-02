package pkg1;

import java.util.Scanner;

public class p11_alt {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pin = 1234, entry;
		float balance = 5000, wd, dp;
		int choice;
		Scanner scan = new Scanner(System.in);
		System.out.println("**********Welcome to ABC Bank ATM**********\n");
		System.out.print("Enter PIN: ");
		entry = scan.nextInt();
		if(entry == pin) {
			while(true) {
				System.out.print("\n1. Check Balance\n2. Withdraw Money\n3. Deposit Money\n4. Exit\nYour Choice: ");
				choice = scan.nextInt();
				switch(choice) {
					case 1: 
						System.out.println("\nAccount Balance = "+ balance);
						break;
					case 2: 
						System.out.print("\nEnter the withdrawal amount: ");
						wd = scan.nextInt();
						if(wd > balance) {
							System.out.println("\nInsufficient balance. Please try again...");
						}
						else {
							balance -= wd;
							System.out.println("Your withdrawal of amount "+wd+" has been successfully done.\nYour account balance = "+balance);
						}
						break;
					case 3:
						System.out.print("\nEnter the deposit amount: ");
						dp = scan.nextInt();
						balance += dp;
						System.out.println("\nYour deposit of amount "+dp+" has been successfully done.\nYour account balance = "+balance);
						break;
					case 4:
						System.out.println("\nThanks for using our system. Visit again...");
						System.exit(0);
					default:
						System.out.println("Invalid Input!");
				}
			}
		}
		else {
			System.out.println("Incorrect PIN. System exited...\n");
			System.exit(0);
		}
		scan.close();
	}
	
	
}
