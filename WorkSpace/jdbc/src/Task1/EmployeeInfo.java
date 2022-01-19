package Task1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class EmployeeInfo {

	public static void main(String[] args) {
	     try {
	    	 Scanner scan = new Scanner(System.in);
	    	 System.out.println("Enter email : " );
	    	 String email = scan.next();
	    	 
	    	 System.out.println("Enter password :");
	    	 String password = scan.next();
	    	 
	    	 
	    	 
	    	 Class.forName("com.mysql.cj.jdbc.Driver");
	    	 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Task1","root", "Root");
	    	 
	    	
	    	 PreparedStatement stmt = con.prepareStatement("select * from emplyeeinfo where email=? and password =? ");
	    	 stmt.setString(1,"email");
	    	 stmt.setString(2, "password");
	    	 if( email.equals(email) && password.equals(password)) {
	    		 System.out.println("valid user");
	    	 }else {
	    		 System.out.println("invalid user "); 
	         }

	     	
	
	    	 ResultSet rs = stmt.executeQuery();  
	    	// boolean result = stmt.execute(); 
	    	
	    	
	    	
	         con.close();
	       
	    	// System.out.println("input email & password is correct : " );
	    	 
	     }catch(Exception e) {
	    	 e.printStackTrace();
	     }

	}

}
