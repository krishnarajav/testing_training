package exception_handling;

public class exp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a  = 5, b = 2, c;
		int arr[] = {1, 2, 3, 4, 5};
		try {
			c = a / (b - 2);
			arr[5] = 10;
		}
		catch(ArithmeticException ai) {
			System.out.println(ai); 
		}
		catch(ArrayIndexOutOfBoundsException ae) { 
			System.out.println(ae); 
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("Finally Block");
		}
	}

}
