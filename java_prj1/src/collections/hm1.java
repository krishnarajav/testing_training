package collections;

import java.util.HashMap;

public class hm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Apple");
		map.put(2, "Orange");
		map.put(3, "Banana");
		
		System.out.println(map);
		
		System.out.println(map.get(3));
	}

}
