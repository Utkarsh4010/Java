
public class Encapsulation {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setId(120);
		emp.setName("ABC");
		emp.setGender("Male");
		emp.printDetails();
	}

}
 
class Employee{
	private int empId;
	private String name;
	private String gender;
	
	//set data
	public void setId(int i) {
	if(i>=1 && i<=1000) {
			empId = i;
		} else {
			System.err.println("invalid Id , it must be between 1-1000");
			System.exit(0);
			
	  }
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setGender(String gen) {
		gender = gen;
	}
	//get data
	public int getId() {
		return empId;
	}
	
	public String getName() {
		return name;
	}
	
	public String getGender() {
		return gender;	
	}
	
	public void printDetails() {
		System.out.println("Id : "+ empId);
		System.out.println("Name : "+ name);
		System.out.println("Gender : "+ gender);
	}
	
}
