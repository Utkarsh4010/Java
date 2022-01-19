package Task1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		try {
			Scanner scan = new Scanner(System.in);
			
			
//			System.out.println("Enter id = ");
//			int id = scan.nextInt();
//			
//			System.out.println("Enter name = ");
//			String name = scan.next();
//			
//			System.out.println("Enter email = ");
//			String email = scan.next();
//			
//			System.out.println("Enter password = ");
//			String password = scan.next();
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/task2/","root", "Root");
			PreparedStatement stmt = con.prepareStatement("insert into Employeelogin where empid =? and name=? and email=? and password=?");
			

			//PreparedStatement stmt = con.prepareStatement("select * from Employeelogin where empid =? and name=? and email=? and password=?");
			System.out.println("Enter a case no");
		
			switch(scan.nextInt()) {
			case 1:
				System.out.println("Enter empid : ");
				int id = scan.nextInt();

				System.out.println("Enter Name : ");
				String name = scan.next();
				
				System.out.println("Enter email : ");
				String email = scan.next();
				
				System.out.println("Enter password : ");
				String password = scan.next();
				
				System.out.println("User register successfully");
				break;
				
//		);		case 2:
//				System.out.println("Enter email : ");
//				String email = scan.next();
//				
//				System.out.println("Enter password : ");
//				String password = scan.next();
//				break;
//				
//			case 3:
//				System.out.println("Enter email : ");
//				String email = scan.next();
//				
//				System.out.println("Enter old password : ");
//				String password = scan.next();
//				if(email.equals(email) && password.equals(password)) {
//					System.out.println("Enter new password : ");
//					String newPassword = scan.next();
//					System.out.println("password changed.");	
//				}else {
//					System.out.println("invalid email or password");
//				}
//				break;
//				
//			case 5:
//				System.out.exit(0
			
			default:
				System.out.println("invalid choice message");
		}
			int count = stmt.executeUpdate();
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
