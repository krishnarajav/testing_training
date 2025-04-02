package jdbc_collections;

public class student {
	int sid;
	String sname;
	int phy, chem, avg;
	
	public student(int sid, String sname, int phy, int chem, int avg) {
		this.sid = sid;
		this.sname = sname;
		this.phy = phy;
		this.chem = chem;
		this.avg = avg;
	}
	
	public static int calc_avg(int phy, int chem) {
		double avg = Math.ceil(((float)phy + (float)chem)/2);
		return (int) avg;
	}
}
