package emp.salary;

/* import emp.details.EmployeeInfo;
 * import emp.details.EmployeeAddress;
 * 
 */
import emp.details.*;
import java.util.Scanner;



public class EmployeeSalary {
	public static void main(String [] args) {
		
	}
	public void setEmpInfo() {
		//emp.details.EmployeeInfo info = new emp.details.EmployeeInfo();
		EmployeeInfo info =new EmployeeInfo();  // object created
		System.out.println(info.id);
		System.out.println(info.name);
		System.out.println(info.contact);
		System.out.println(info.gender);
		EmployeeAddress address = new EmployeeAddress(); // object created
		Scanner scan = new Scanner(System.in);
		
		
				
	}

}
class Employeeaccounts extends EmployeeInfo{  //inheritance
	public void accountDetails() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(contact);
		System.out.println(gender);
	}
}
