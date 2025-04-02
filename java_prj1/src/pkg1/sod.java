package pkg1;

public class sod {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 98, rem, sum = 0;
		while(num > 0) {
			rem = num % 10;
			sum += rem;
			num /= 10;
		}
		System.out.print(sum);
	}
	
}
