package oop_student_assignment1;

public class student_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student stu[] = new student[3];
		
		stu[0] = new student("Anil", 7001, 88, 89);
		stu[1] = new student("Dhanush", 7002, 90, 85);
		stu[2] = new student("Prabhu", 7003, 90, 94);
		
		stu[0].display();
		stu[1].display();
		stu[2].display();

		findmax(stu);
	}

	public static void findmax(student stu[]) {
		float max = stu[0].avg;
		String max_name = stu[0].name;
		
		for(int i = 1; i < stu.length; i++) {
			if(stu[i].avg > max) {
				max = stu[i].avg;
				max_name = stu[i].name;
			}
		}
		
		System.out.println("\nWith "+ max + ", " + max_name + " is the highest scorer.");
	}

}
