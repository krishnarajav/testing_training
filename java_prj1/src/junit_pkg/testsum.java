package junit_pkg;

import static org.junit.Assert.*;
import org.junit.Test;

public class testsum {
		sum s;
		int input[] = {12, 58, 78, 2};
		
		@Test
		public void test() {
			s = new sum();
			System.out.println("In test1");
			int m = s.getsum(input);
			assertEquals(m, 150);
		}
		
	

}
