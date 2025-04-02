package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class pro3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String jdbcURL = "jdbc:mysql://localhost:3306/mydb1";
		String dbuname = "root";
		String dbpasswd = "Password@12";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(jdbcURL, dbuname, dbpasswd);
		
		String q = "delete from student where sid = ?;";
		PreparedStatement pstmt = con.prepareStatement(q);
		
		pstmt.setInt(1, 802);
		
		int rowsDeleted = pstmt.executeUpdate();
		if(rowsDeleted > 0)
			System.out.println("Employee was deleted successfully!");
		con.close();
	}

}
