package strings;

public class str2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer("I work with Mphasis at Bangalore");
		int i = 0, words = 0;
		while(i < sb.length()) {
			if(i != 0) {
				if(Character.isLetterOrDigit(sb.charAt(i)) && Character.isWhitespace(sb.charAt(i - 1)) )
					words++;
				i++;
			}
			else {
				if(Character.isLetterOrDigit(sb.charAt(0))) {
					words++;
				}
				i++;
				continue;
			}
		}
		System.out.println(words);
	}

}
