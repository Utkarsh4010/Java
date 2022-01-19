package iteration;

import java.util.ArrayList;

public class GenericTypeDemo2 {

	public static void main(String[] args) {
		ArrayList<Student>studentList = new ArrayList<>();
		Student s1 = new Student(12,"A");
		Student s2 = new Student(121,"B");
		Student s3 = new Student(123,"C");
		
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		
		System.out.println(studentList);

	}

}

class Student{
	private int id ;
	private String name;
	public Student(int id, String name) {      //Constructor
		this.id=id;
		this.name=name;
	}
	
	@Override
	public String toString() {
		return id + "=" + name;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
}
