package exception_handling;

public class checked {

	public static void main(String[] args) {
		try {
            throw new demo("This is a checked exception.");
        } 
		catch (demo e) {
            System.out.println(e.getMessage());
        }
	}

}
