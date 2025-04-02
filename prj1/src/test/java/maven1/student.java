package maven1;

public class student {
	int sid, maths, phy;
	float avg;
	public student(int sid, int maths, int phy, float avg) {
		this.sid = sid;
		this.maths = maths;
		this.phy = phy;
		this.avg = calc_avg(maths, phy);
	}
	
	public float calc_avg(int maths, int phy) {
		return (float) (maths + phy) / 2.0f;
	}
}
