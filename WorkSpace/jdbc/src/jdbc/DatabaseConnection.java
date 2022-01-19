package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

	public static void main(String[] args) {
		try {
			//1 Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2 Create Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd27sept","root", "Root");
			
			//5 Close Connection
			con.close();
			System.out.println("Database connection successfully Done...");
			
		} catch(Exception e){
			e.printStackTrace();
			
		}

	}

}
