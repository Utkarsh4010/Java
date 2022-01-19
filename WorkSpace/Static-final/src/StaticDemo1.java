
public class StaticDemo1 {

	public static void main(String[] args) {
		printCompanyDetails();
	}



public static void printCompanyDetails() {
	System.out.println(Company.name);
	Company.test();
}
}

class Company{
	public static String name = "XYZ pvt ltd";
	public int year = 1999;
	public static void test() {
		System.out.println(name);
		//System.out.println(year);  //compile time error because non static variable
		System.out.println("This is the method from Company class.");
	}
}
