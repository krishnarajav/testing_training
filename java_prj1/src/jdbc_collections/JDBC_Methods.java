package jdbc_collections;

import java.util.HashMap;
import java.util.Map.Entry;
import java.sql.*;

public class JDBC_Methods extends student {
	public JDBC_Methods(int sid, String sname, int phy, int chem, int avg) {
		super(sid, sname, phy, chem, avg);
	}

	static HashMap<Integer, student> hm = new HashMap<>();
	static String jdbcURL = "jdbc:mysql://localhost:3306/mydb1";
	static String dbuname = "root";
	static String dbpasswd = "Password@12";
	
	public void insertion() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(jdbcURL, dbuname, dbpasswd);
		
		String q = "insert into stu(sid, sname, phy, chem) values (?, ?, ?, ?), (?, ?, ?, ?), (?, ?, ?, ?), (?, ?, ?, ?), (?, ?, ?, ?);";
		PreparedStatement pstmt = con.prepareStatement(q);
		
		pstmt.setInt(1, 100);
		pstmt.setString(2, "Mahesh");
		pstmt.setInt(3, 85);
		pstmt.setInt(4, 90);
		
		pstmt.setInt(5, 101);
		pstmt.setString(6, "Suresh");
		pstmt.setInt(7, 82);
		pstmt.setInt(8, 87);
		
		pstmt.setInt(9, 102);
		pstmt.setString(10, "Manish");
		pstmt.setInt(11, 81);
		pstmt.setInt(12, 80);
		
		pstmt.setInt(13, 103);
		pstmt.setString(14, "Anish");
		pstmt.setInt(15, 89);
		pstmt.setInt(16, 92);
		
		pstmt.setInt(17, 104);
		pstmt.setString(18, "Ramesh");
		pstmt.setInt(19, 95);
		pstmt.setInt(20, 98);
		
		int rowinserted = pstmt.executeUpdate();
		if(rowinserted > 0) 
			System.out.println("Students inserted successfully!");
		con.close();
	}
	
	public void get_data() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(jdbcURL, dbuname, dbpasswd);
		Statement stmt = con.createStatement();
		String q = "select * from stu;";
		ResultSet rs = stmt.executeQuery(q);
		while(rs.next()) {
			int sid = rs.getInt("sid");
			String sname = rs.getString("sname");
			int phy = rs.getInt("phy");
			int chem = rs.getInt("chem");
			student s = new student(sid, sname, phy, chem, calc_avg(phy, chem));
			hm.put(s.sid, s);
		}
		con.close();
		
		System.out.println("\nUpdated HM:");
		for(Entry<Integer, student> pro : hm.entrySet()) {
			student x = pro.getValue();
			System.out.println(pro.getKey() + " " + x.sname + " " + x.phy + " " + x.chem + " " + x.avg);
		}
	}
	
	public void update_avg() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(jdbcURL, dbuname, dbpasswd);
		int i = 0;
		for(Entry<Integer, student> pro : hm.entrySet()) {
			student x = pro.getValue();
			String q = "update stu set avg = ? where sid = ?;";
			PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.setInt(1, x.avg);
			pstmt.setInt(2, pro.getKey());
			pstmt.executeUpdate();
			i++;
		}
		System.out.println("\nUpdated " + i + " rows on table");
		con.close();
	}
}
