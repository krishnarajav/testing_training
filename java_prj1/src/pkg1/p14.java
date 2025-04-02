package pkg1;
import java.util.Arrays;
public class p14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {2, 6, 7, 8, 9};
		int ele = 9;
		int search = Arrays.binarySearch(nums, ele);
		System.out.println(ele + " is at pos " + search);
		Arrays.fill(nums, 5);
		System.out.println("\nAfter Fill:");
		for(int n : nums) {
			System.out.print(n + " ");
		}
	}

}
