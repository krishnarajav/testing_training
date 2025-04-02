package collections;

import java.util.HashMap;
import java.util.Map.Entry;

public class student_hm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, hmstudent> hms = new HashMap<Integer, hmstudent>();
		
		hmstudent s1 = new hmstudent("Sameer", 101, 21);
		hmstudent s2 = new hmstudent("Mihir", 102, 21);
		
		hms.put(s1.id, s1);
		hms.put(s2.id, s2);
		
		System.out.println("Iterating over HashMap:");
		
		for(Entry<Integer, hmstudent> e : hms.entrySet()) {
			hmstudent s = e.getValue();
			System.out.println("ID: " + e.getKey() + " Name: " + s.name + " Age: " + s.age);
		}
 	}

}
