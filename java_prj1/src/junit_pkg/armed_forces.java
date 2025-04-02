package junit_pkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class armed_forces {
	static Scanner scan= new Scanner(System.in);
	public static void main(String args[]) {
		display();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	static void display() {
		String name, ut;
		char sa;
		int age;
		ArrayList<String> al = new ArrayList<>();
		al.addAll(Arrays.asList("andaman", "pondicherry", "delhi", "j&k", "ladakh","daman & diu", "chandigarh", "lakshadweep"));
		System.out.print("Enter your name: ");
		name = scan.nextLine();
		System.out.print("Enter your age: ");
		age = scan.nextInt();
		scan.nextLine();
		System.out.print("Enter you location: ");
		ut = scan.nextLine();
		System.out.print("Are you specially abled? (Y/N):");
		sa = scan.next().charAt(0);
		if(age >= 17 && age <= 37 && !al.contains(ut.toLowerCase()) && Character.toUpperCase(sa) == 'N')
			
			System.out.println(name + " is eligible");
		else
			System.out.println(name + " is not eligible");
	}
}
