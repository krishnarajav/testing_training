package collections;

public class student_comparable implements Comparable<student_comparable> {
	public String sname;
	public int id, age;
	
	public student_comparable (String sname, int id, int age) {
		this.sname = sname;
		this.id = id;
		this.age = age;
	}
	
	public void display() {
		System.out.println(sname + " " + id + " " + age);
	}
	
	@Override
	public int compareTo(student_comparable s) {
		return this.age - s.age;
	}
}
