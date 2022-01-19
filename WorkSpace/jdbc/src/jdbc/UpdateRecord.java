package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateRecord {

	public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/fsd27sept", "root", "Root");
		//PreparedStatement stmt = con.prepareStatement("update studentinfo set contact='99887456' where id='5'");
		PreparedStatement stmt = con.prepareStatement("update studentinfo set contact=? where id=?");
		stmt.setString(1, "9487513112");
		stmt.setInt(2, 6);
		int count= stmt.executeUpdate();
		con.close();
		System.out.println("Total rows updated : " + count);
		
	}catch(Exception e) {
		e.printStackTrace();
		
	}

	}

}
