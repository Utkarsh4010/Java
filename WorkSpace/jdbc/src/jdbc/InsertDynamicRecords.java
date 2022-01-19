package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertDynamicRecords {

	public static void main(String[] args) {
		try {
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter id : ");
			int id = scan.nextInt();
			
			System.out.println("Enter name : ");
			String name = scan.next();
			
			//System.out.println("Enter contact : ");
			//String contact = scan.next();
			
			System.out.println("Enter city : ");
			String city = scan.next();
			
			//1 Register Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//2 Create Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd27sept","root", "Root");
			
			//3 Create Statement
			PreparedStatement stmt = con.prepareStatement("insert into studentinfo values(?,?,'5668877',?)");
			stmt.setInt(1,id);
			stmt.setString(2, name);
			//stmt.setString(3, contact);
			stmt.setString(3, city);
			
			
			
			
			
			//4 Execute Statement
			int count = stmt.executeUpdate();
			
			//5 Close Connection
			stmt.close();
			con.close();
			
			System.out.println("Total Rows Inserted is : " + count);
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
