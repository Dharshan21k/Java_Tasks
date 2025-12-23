package Exceptions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlExceptions {
	public static Connection getsConnection() throws SQLException{
		 
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/your_database", "username", "password");
	}
 public static void main(String args[]) {
	 try {
		 Connection con=getsConnection();
	 }catch(SQLException e) {
		 System.out.println(e.getMessage());
		 
		 
	 }
	 
 }

}
