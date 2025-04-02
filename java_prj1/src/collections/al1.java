package collections;

import java.util.ArrayList;

public class al1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> s = new ArrayList<String>();
		s.add("abc");
		s.add("def");
		s.add("ghi");
		s.add("jkl");
		s.add("mno");
		System.out.println("Element at position 2 is " + s.get(2));
		s.remove(4);
		s.add(0, "xyz");
		for(int i = 0; i < s.size(); i++) {
			System.out.println("Element at position " + i + " is " + s.get(i));
		}
		s.clear();
		System.out.println(s);
	}

}
