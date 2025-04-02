package pkg1;
import java.util.Scanner;
public class p10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact[][] = new int[5][2];
		Scanner scan = new Scanner(System.in);
		for(int i = 0; i < 5; i++) {
			fact[i][0] = scan.nextInt();
		}
		scan.close();
		for(int i = 0; i < 5; i++) {
			int factorial = 1;
			int num = fact[i][0];
			while(num > 1) {
				factorial *= num;
				num--;
			}
			fact[i][1] = factorial;
		}
		for(int i = 0; i < 5; i++) {
			System.out.print(fact[i][0] + "!" + " = " + fact[i][1]);
			System.out.println();
		}
	}

}

