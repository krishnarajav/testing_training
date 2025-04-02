package junit_pkg;

public class busroutes {
	int routeid, tseats, rseats, cost;
	String from, to;
	
	public busroutes(int routeid, String from, String to, int tseats, int rseats, int cost) {
		this.routeid = routeid;
		this.from = from;
		this.to = to;
		this.tseats = tseats;
		this.rseats = rseats;
		this.cost = cost;
	}
}
