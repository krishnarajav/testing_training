package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class al2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubW
 		List<Integer> nlist = Arrays.asList(1, 5, 4, 9, 2);
		System.out.println(nlist);
	
		Collections.sort(nlist);
		System.out.println(nlist);
		Collections.reverse(nlist);
		System.out.println(nlist);
	}

}
