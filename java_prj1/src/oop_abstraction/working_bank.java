package oop_abstraction;

public class working_bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank b;
		
		b = new icici();
		System.out.println("ICICI Bank's ROI: " + b.getROI() + "%");
		
		b = new canara();
		System.out.println("Canara Bank's ROI: " + b.getROI() + "%");
	}

}
