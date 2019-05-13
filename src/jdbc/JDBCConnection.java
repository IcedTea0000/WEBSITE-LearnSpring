package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCConnection {

	public Connection getConnection(){
		String username="root";
		String password="";
		String url="jdbc:mysql://localhost:3306/test";
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection(url, username, password);
			return conn;
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
}
