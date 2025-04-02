package pkg1;
import java.util.Arrays;
public class p13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {6, 8, 2, 9, 3};
		for(int n : nums) {
			System.out.print(n + " ");
		}
		Arrays.sort(nums);
		System.out.println();
		for(int n : nums) {
			System.out.print(n + " ");
		}
	}

}
