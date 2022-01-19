package emp.details;

public class EmployeeAddress extends EmployeeInfo {

	public void empInfo() {
		EmployeeInfo info = new EmployeeInfo();
		System.out.println(info.id);
		System.out.println(info.name);
		System.out.println(info.contact);
		System.out.println(info.gender);
		
	}
	public void printEmpInfo() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(contact);
		System.out.println(gender);
	}

}
