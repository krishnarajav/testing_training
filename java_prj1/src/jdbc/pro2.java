package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class pro2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String jdbcURL = "jdbc:mysql://localhost:3306/mydb1";
		String dbuname = "root";
		String dbpasswd = "Password@12";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(jdbcURL, dbuname, dbpasswd);
		
		String q = "insert into student values(?, ?, ?, ?, ?);";
		PreparedStatement pstmt = con.prepareStatement(q);
		
		pstmt.setInt(1, 802);
		pstmt.setString(2, "Mahesh");
		pstmt.setInt(3, 85);
		pstmt.setInt(4, 90);
		pstmt.setInt(5, 16);
		
		int rowinserted = pstmt.executeUpdate();
		if(rowinserted > 0) 
			System.out.println("A new employee was inserted successfully!");
		con.close();
	}

}
