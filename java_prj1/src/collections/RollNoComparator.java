package collections;
import java.util.Comparator;

public class RollNoComparator implements Comparator<student_comparable> {
	
	@Override
	public int compare(student_comparable s1, student_comparable s2) {
		return s1.id - s2.id;
	}
}
