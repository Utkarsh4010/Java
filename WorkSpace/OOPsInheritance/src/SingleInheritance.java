
public class SingleInheritance {

	public static void main(String[] args) {
		B objB = new B();
		objB.m(); // can access parent class method using child class object
		objB.show();

	}

}

class A{
	int a = 10;
	public void m() {
		System.out.println("This is m() method from A class");
		
	}
}

class B extends A{
	int x = 20;
	public void show(){
		System.out.println("x : "+ x);
		System.out.println("a : "+ a); //can access properties of parent directly.
		m();
	}
}