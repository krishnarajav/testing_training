package collections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<student_comparable> std_list = new ArrayList<student_comparable>();
		std_list.add(new student_comparable("Priya", 110, 26));
		std_list.add(new student_comparable("Bob", 105, 28));
		std_list.add(new student_comparable("Suresh", 109, 26));
		std_list.add(new student_comparable("Rajesh", 101, 26));
		
		for(student_comparable s : std_list) {
			System.out.println(s.id + " " + s.sname + " " + s.age);
		}
		
		Collections.sort(std_list);
		System.out.println("\nSorted List (Using comparable - age):");
		for(student_comparable s : std_list) {
			System.out.println(s.id + " " + s.sname + " " + s.age);
		}
		
		Collections.sort(std_list, new RollNoComparator());
		System.out.println("\nSorted List (Using comparable - roll no):");
		for(student_comparable s : std_list) {
			System.out.println(s.id + " " + s.sname + " " + s.age);
		}
		
		Collections.sort(std_list, new name_comparator());
		System.out.println("\nSorted List (Using comparable - name):");
		for(student_comparable s : std_list) {
			System.out.println(s.id + " " + s.sname + " " + s.age);
		}
	}

}
