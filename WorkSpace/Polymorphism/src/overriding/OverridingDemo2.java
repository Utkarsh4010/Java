package overriding;

public class OverridingDemo2 {

	public static void main(String[] args) {
		Child c = new Child();
		c.m1();
	}

}

class X{
	
}

class Y extends X{
	
}

class Z extends Y{
	
}

class Parent{
	protected void m1() {
		System.out.println("Parent class m1()");
		
	}
	public X m2(int a) {
		System.out.println("Parent class m2(int)");
		return new X();   //object
	}
}
class Child extends Parent{
	protected void m1() {
		System.out.println("Child class m1()");
	}
	
	public Z m2(int a) {
		return new Z();
	}
	
}
