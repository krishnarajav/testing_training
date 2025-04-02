package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class pro4 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String jdbcURL = "jdbc:mysql://localhost:3306/mydb1";
		String dbuname = "root";
		String dbpasswd = "Password@12";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(jdbcURL, dbuname, dbpasswd);
		
		String q = "update student set age = ? where sid = ?;";
		PreparedStatement pstmt = con.prepareStatement(q);
		
		pstmt.setInt(1, 17);
		pstmt.setInt(2, 700);
		
		int rowsDeleted = pstmt.executeUpdate();
		if(rowsDeleted > 0)
			System.out.println("Employee was updated successfully!");
		con.close();
	}

}
