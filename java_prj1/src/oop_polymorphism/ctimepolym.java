package oop_polymorphism;

public class ctimepolym {
	
	int add(int a, int b) {
		System.out.println("Addition of 2 numbers:");
		return a + b;
	}
	
	int add(int a, int b, int c) {
		System.out.println("Addition of 3 numbers:");
		return a + b + c;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ctimepolym obj = new ctimepolym();
		System.out.println(obj.add(5, 10));
		System.out.println(obj.add(5, 10, 15));
	}

}
