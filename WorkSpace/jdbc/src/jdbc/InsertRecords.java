package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertRecords {

	public static void main(String[] args) {
		try {
			//1 Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2 Create Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd27sept", "root", "Root");
			//3 Create Statement
			PreparedStatement stmt = con.prepareStatement("insert into studentinfo values(5,'Demo 5', '66998877', 'Delhi')");
			//4 Execute Statement
			int count = stmt.executeUpdate();
			// 5 Close Connection
			stmt.close();
			con.close();
			
			System.out.println("Total rows inserted is : " + count);
			
		}catch(Exception e) {
			e.printStackTrace();
			
		}

	}

}
