package junit_pkg;

import java.util.HashMap;
import java.util.Map.Entry;
import java.sql.*;

public class data_functions {
	static HashMap<Integer, busroutes> hm1 = new HashMap<Integer, busroutes>();
	static HashMap<Integer, busbooking> hm2 = new HashMap<Integer, busbooking>();
	private static String jdbcURL = "jdbc:mysql://localhost:3306/mydb1";
	private static String dbuname = "root";
	private static String dbpasswd = "Password@12";
	
	
	public static void getdata() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(jdbcURL, dbuname, dbpasswd);
		Statement stmt1 = con.createStatement();
		String q1 = "select * from busroute;";
		ResultSet rs1 = stmt1.executeQuery(q1);
		while(rs1.next()) {
			int routeid = rs1.getInt("routeid");
			String from = rs1.getString("from1");
			String to = rs1.getString("to1");
			int tseats = rs1.getInt("totalSeats");
			int rseats = rs1.getInt("remainingSeats");
			int cost = rs1.getInt("cost");
			busroutes b = new busroutes(routeid, from, to, tseats, rseats, cost);
			hm1.put(b.routeid, b);
		}
		
		Statement stmt2 = con.createStatement();
		String q2 = "select * from booking;";
		ResultSet rs2 = stmt2.executeQuery(q2);
		while(rs2.next()) {
			int bookingid = rs2.getInt("bookingId");
			int routeid = rs2.getInt("routeId");
			int seats = rs2.getInt("noofseats");
			int total = rs2.getInt("totalamt");
			busbooking x = new busbooking(bookingid, routeid, seats, total);
			hm2.put(x.routeid, x);
		}
		con.close();
	}
	
	public static void putdata(int rid, int n, int bid) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(jdbcURL, dbuname, dbpasswd);
		
		String q1 = "update busroute set remainingSeats = ? where routeid = ?;";
		PreparedStatement pstmt1 = con.prepareStatement(q1);
		
		for(Entry<Integer, busroutes> x : hm1.entrySet()) {
			if(x.getKey() == rid) {
				busroutes b = x.getValue();
				pstmt1.setInt(1, b.rseats);
				pstmt1.setInt(2, rid);
				pstmt1.executeUpdate();
			}
			else
				continue;
		}
		
		String q2 = "insert into booking values(?, ?, ?, ?);";
		PreparedStatement pstmt2 = con.prepareStatement(q2);
		for(Entry<Integer, busbooking> e : hm2.entrySet()) {
			if(e.getKey() == bid) {
				busbooking c = e.getValue();
				pstmt2.setInt(1, c.bookingid);
				pstmt2.setInt(2, c.routeid);
				pstmt2.setInt(3, c.noofseats);
				pstmt2.setInt(4, c.totalamt);
				pstmt2.executeUpdate();
			}
			else 
				continue;
		}
		con.close();
		
		System.out.println("                     Booking Status                     ");
		System.out.println("========================================================");
		System.out.println("|BID|RID|Seats|Total|");
		System.out.println("========================================================");
		for(Entry<Integer, busbooking> e : hm2.entrySet()) {
			if(e.getKey() == bid) {
				busbooking c = e.getValue();
				System.out.println("|" + e.getKey() + "|" + c.routeid + "|" + c.noofseats + "|" + c.totalamt + "|");
			}
			else
				continue;
		}
		System.out.println("========================================================");
		System.out.println();
	}
}
