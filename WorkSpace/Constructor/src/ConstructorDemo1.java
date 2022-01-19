
public class ConstructorDemo1 {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.print();
		
		
		Employee emp1 = new Employee(10,"abc");
	    emp1.print();   

	}

}

class Employee{ 
	private int id;
	private String name;
	
	// No parameterized constructor
	public Employee() {
		System.out.println("This is Employee constructor...");
		id = 111;
		name = "No Name Assigned";
		
	}
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public void print() {
	   System.out.println("Id : "+ id);
	   System.out.println("Name : "+ name);
	
	}
}