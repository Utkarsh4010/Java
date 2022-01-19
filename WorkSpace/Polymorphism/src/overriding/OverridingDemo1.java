package overriding;

public class OverridingDemo1 {

	public static void main(String[] args) {
		
		
		B b = new B();
		b.m();
		
		
		

	}

}

class A{
	protected void m() {
		System.out.println("This is class A and method m()");
	}
}

class B extends A{
	protected void m() {
		System.out.println("This is class B and method m()");
	}
}
