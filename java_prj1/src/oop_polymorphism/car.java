package oop_polymorphism;

public class car extends vehicle{

	//@Override
	public void start() {
		System.out.println("Car has self-starter");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		vehicle v = new vehicle();
		v.start();
		car c = new car();
		c.start();
	}

}
