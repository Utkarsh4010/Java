
public class InheritanceDemo1 {

	public static void main(String[] args) {
       Person emp = new Employee("ABCD", 'M', 121, 1254892.25);
       emp.print();


	}

}
class Person{
	String name;
	char gender;
	public Person() {      //Constructor
		System.out.println("This is no paramerized from person class");
	}
	
	public Person(String name, char gender) {    //Constructor
		this();
		this.name= name;
		this.gender= gender;
		System.out.println("This is 2 parameterized from person class ");
		
	}
	
	public void print() {
		System.out.println("Name :" + name);
		System.out.println("Gender :" + gender);
	}
}

class Employee extends Person{
	int id;
	double salary;
	public Employee(String name, char gender, int id, double salary) {     //Constructor
		super(name, gender);
		this.id=id;
		this.salary=salary;
		
	}
	public void print() {
		System.out.println("Id :" + id);
		super.print();
		System.out.println("Salary : "+ salary);
	}
}





