package collections;

import java.util.Comparator;

public class name_comparator implements Comparator<student_comparable> {
	@Override
	public int compare(student_comparable s1, student_comparable s2) {
		return s1.sname.compareTo(s2.sname);
	}
}
