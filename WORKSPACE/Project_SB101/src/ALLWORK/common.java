package ALLWORK;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class common {

	
	public static Connection provideConnection() {
		
		Connection conn=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url="jdbc:mysql://localhost:3306/pk";
		
		
		
		try {
			conn= DriverManager.getConnection(url,"root","Prince@123");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.print(e.getMessage());
		}
		return conn;
		
	}
	
	
}