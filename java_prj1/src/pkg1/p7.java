package pkg1;

public class p7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 98, rem;
		int i = 1, sum1 = 0, sum2 = 0;
		while(num > 0) {
			rem = num % 10;
			if(i % 2 != 0) {
				sum1 += rem;
			}
			else {
				sum2 += rem;
			}
			num /= 10;
			i++;
		}
		if(i % 2 == 0) {
			System.out.print(sum1);
		}
		else {
			System.out.print(sum2);
		}
	}

}
