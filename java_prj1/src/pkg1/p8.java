package pkg1;
import java.util.Scanner;
public class p8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20, b = 15, d = 0;
		Scanner scan = new Scanner(System.in);
		char c = scan.next().charAt(0);
		switch(c) {
			case '+':
				d = a + b;
				break;
			case '-':
				d = a - b;
				break;
			case '*':
				d = a * b;
				break;
			case '/':
				d = a / b;
				break;
			default:
				System.out.println("Nothing is matched.");
				System.exit(0);
		}
		scan.close();
		System.out.println(a + " " + c + " " + b + " = " + d);
	}

}
