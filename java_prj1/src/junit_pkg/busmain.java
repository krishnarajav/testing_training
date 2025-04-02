package junit_pkg;

import java.sql.SQLException;

public class busmain {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		data_functions.getdata();
		ticket_booking.displayroutes();
		ticket_booking.bookseat();
	}

}
