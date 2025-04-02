package collections;

import java.util.ArrayList;

public class al_object {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<student> s = new ArrayList<student>();
		s.add(new student(101, "Abhi"));
		s.add(new student(102, "Rohith"));
		s.add(new student(103, "Hrithik"));
		
		for(student x : s) {
			System.out.println(x.id+" "+x.name);
		}
		
		student a = s.get(0);
		System.out.println("\nID: " + a.id + "\nName: " + a.name);
		
		for(student x : s) {
			if(x.id == 103) {
				System.out.println("\nStudent with id = 103 is " + x.name);
			}
		}
	}

}
