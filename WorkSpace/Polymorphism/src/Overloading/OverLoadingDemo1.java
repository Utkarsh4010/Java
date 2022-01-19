package Overloading;

public class OverLoadingDemo1 {

	public static void main(String[] args) {
		Addition addition = new Addition();
		addition.add(23,34);
		addition.add(23,4,6);
		addition.add(4.4, 4);

	}
	public static void main(int val) {
		Calculator cal = new Calculator();
		cal.add("abc","xyz");
	}

}

class Addition {
	public final int add(int a, int b) {
		System.out.println("2 int addition");
		return a+b;
	}
	
	final int add(int a, int b, int c) {
		System.out.println("3 int addition");
		return a+b+c;
	}
	
	final double add(double a, int b) {
		System.out.println("1 double + 1 int addition");
		return a+b;
	}
}

class Calculator extends Addition{
	public final String add(String a, String b) {
		System.out.println("2 String addition");
		return a+b;
	}
}
