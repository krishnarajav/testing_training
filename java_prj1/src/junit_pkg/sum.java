package junit_pkg;

public class sum {
	public int getsum(int n[]) {
		int s = 0;
		for(int a : n) {
			s = s + a;
		}
		return s;
	}
}
