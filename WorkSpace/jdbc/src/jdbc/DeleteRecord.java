package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeleteRecord {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd27sept","root", "Root");
			PreparedStatement stmt = con.prepareStatement("delete from studentinfo where name=?");
			stmt.setString(1, "Demo");
			int count = stmt.executeUpdate();
			con.close();
			System.out.println("Total rows deleted " + count);
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
}
