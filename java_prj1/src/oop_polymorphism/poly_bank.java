package oop_polymorphism;

public class poly_bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank b;
		b = new bob();
		System.out.println("Bob: ROI " + b.getROI());
		b = new citi();
		System.out.println("Citi: ROI " + b.getROI());
		b = new canara();
		System.out.println("Bob: ROI " + b.getROI());
	}

}
