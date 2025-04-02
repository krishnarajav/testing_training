package strings;

import java.util.ArrayList;

public class str3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("I work with Mphasis at Bangalore");
		ArrayList<String> a = new ArrayList<>();
		int s = 0, e = 0;
		while(e < sb.length()) {
			if(Character.isLetterOrDigit(sb.charAt(e)))
				e++;
			else if(sb.charAt(e) == ' ' && !Character.isWhitespace(sb.charAt(e-1))) {
				a.add(sb.substring(s, e));
				s = e + 1;
				e++;
			}
			else if(e == sb.length() - 1) {
				a.add(sb.substring(s, e));
			}
			
		}
		System.out.println(a);
	
	}

}
