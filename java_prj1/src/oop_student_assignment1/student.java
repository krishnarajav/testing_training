package oop_student_assignment1;

public class student {
	String name;
	int id, marks_cc, marks_ml;
	float avg;
	
	public student(String name, int id, int marks_cc, int marks_ml) {
		this.name = name;
		this.id = id;
		this.marks_cc = marks_cc;
		this.marks_ml = marks_ml;
		this.avg = calc_avg();
	}
	
	public float calc_avg() {
		float avg =(marks_cc + marks_ml) / 2f;
		return avg;
	}
	
	public void display() {
		System.out.println("The average marks scored by "+ name + " is " + avg);
	}
	
}
