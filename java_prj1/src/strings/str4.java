package strings;

public class str4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("Hi Surya, when will we meet again?");
		int i = sb.indexOf(" ");
		int j = sb.indexOf(",");
		System.out.println(sb.substring(i + 1, j));
	}
}
