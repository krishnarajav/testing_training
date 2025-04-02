package collections;

import java.util.Vector;

public class vector_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> vec = new Vector<String>();
		
		vec.add("Java");
		vec.add("DB");
		vec.add("Git");
		System.out.println(vec);
		
		vec.remove("DB");
		System.out.println(vec);
	}

}
