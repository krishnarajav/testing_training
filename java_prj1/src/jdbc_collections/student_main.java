package jdbc_collections;

import java.sql.SQLException;

public class student_main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		JDBC_Methods j = new JDBC_Methods(0, null, 0, 0, 0);
		j.insertion();
		j.get_data();
		j.update_avg();
	}

}
