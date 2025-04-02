package pkg1;

public class p6_copy {
	
	public int sum_of_digit(int num) {
		int sum = 0, rem;
		while(num > 0) {
			rem = num % 10;
			if(rem % 2 == 0) {
				sum += rem;
			}
			num /= 10;
		}
		return sum;
	}
}
