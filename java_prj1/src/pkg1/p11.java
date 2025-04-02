package pkg1;
import java.util.Scanner;
public class p11 {

	static float balance = 5000, wd, dp;
	static Scanner scan = new Scanner(System.in);
	
	public static int menu() {
		int choice;
		System.out.print("\n1. Check Balance\n2. Withdraw Money\n3. Deposit Money\n4. Exit\nYour Choice: ");
		choice = scan.nextInt();
		return choice;
	}
	
	public static void balance() {
		System.out.println("\nAccount Balance = "+ balance);
	}
	
	public static void withdraw() {
		System.out.print("\nEnter the withdrawal amount: ");
		wd = scan.nextInt();
		if(wd > balance) {
			System.out.println("\nInsufficient balance. Please try again...");
		}
		else {
			balance -= wd;
			System.out.println("\nYour withdrawal of amount "+wd+" has been successfully done.\nYour account balance = "+balance);
		}
	}

	public static void deposit() {
		System.out.print("\nEnter the deposit amount: ");
		dp = scan.nextInt();
		balance += dp;
		System.out.println("\nYour deposit of amount "+dp+" has been successfully done.\nYour account balance = "+balance);
	}
	
	public static void exit() {
		System.out.println("\nThanks for using our system. Visit again...");
		System.exit(0);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pin = 1234, entry, choice;
		int n = 4;
		System.out.println("**********Welcome to ABC Bank ATM**********\n");
		while(n > 0) {
			System.out.print("Enter PIN: ");
			entry = scan.nextInt();
			if(entry != pin) {
				n--;
				if(n == 0)
					break;
				System.out.println("Incorrect PIN. " + n + " tries left...\n");
				continue;
			}
			else {
				while(true) {
					choice = menu();
					switch(choice) {
						case 1:
							balance();
							break;
						case 2:
							withdraw();
							break;
						case 3:
							deposit();
							break;
						case 4:
							exit();
							break;
					}
				}
			}
		}
	}

}
