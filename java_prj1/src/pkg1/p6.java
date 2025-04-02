package pkg1;

public class p6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 94382, sum = 0, rem, n = num;
		while(num > 0) {
			rem = num % 10;
			if(rem % 2 == 0) {
				sum += rem;
			}
			num /= 10;
		}
		System.out.println("Sum of digits of "+n+" = "+sum);
	}

}
