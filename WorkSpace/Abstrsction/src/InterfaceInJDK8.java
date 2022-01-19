
public interface InterfaceInJDK8 {
int a = 20;
public void m();//abstract methods

public default void m1() { // default method from JDK 1.8 onwards
	System.out.println("This is default method from interface");
}

public static void m2() { // static method from JDk 1.8 onwards
	System.out.println("This is static method from interface");
}

public static void main(String [] args) {
	System.out.println("This is the main method from interface");
}
}

@FunctionalInterface   // only one abstract method
interface Inter{
	public void m(); 
	public default void m1() {
		
	}
	
	public static void main(String [] args) {
		
	}
	
}

class Demo implements InterfaceInJDK8{
	public void m() {
		
	}
	public static void main(String [] args) {
		Demo d = new Demo();
		d.m1();
	}
}
