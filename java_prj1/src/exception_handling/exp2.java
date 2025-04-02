package exception_handling;

public class exp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 5, c;
		try {
			c = a / (b - 5);
			System.out.println(c);
		}
		catch(Exception e) {
			System.out.println("Exception has occurred!");
		}
		finally {
			System.out.println("Finally block");
		}
	}

}
