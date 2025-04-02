package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class pro1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String jdbcURL = "jdbc:mysql://localhost:3306/mydb1";
		String dbuname = "root";
		String dbpasswd = "Password@12";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(jdbcURL, dbuname, dbpasswd);
		Statement stmt = con.createStatement();
		String q = "select * from student";
		ResultSet rs = stmt.executeQuery(q);
		while(rs.next()) {
			int id = rs.getInt("sid");
			String n = rs.getString("sname");
			System.out.println(id + " " + n);
		}
		con.close();
	}

}
