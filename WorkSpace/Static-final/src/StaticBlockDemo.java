
public class StaticBlockDemo {

	public static void main(String[] args) {
		Test t = new Test();
		

	}

}

class Test{
	public Test() {
		System.out.println("This is no param constructor");
	}
	
	static {
		System.out.println("static block from Test");  // it executes before constructor
	}
}
