
public class StaticVariable {

	public static void main(String[] args) {
		Counter obj1 = new Counter();
		Counter obj2 = new Counter();
		Counter obj3 = new Counter();
		obj3.printValue();
	}

}

class Counter{
	int c1 = 0; //instance variable
	static int c2 = 0; //class/static variable
	public Counter() {
		c1 = c1 + 1;
		c2 = c2 + 1;
	}
	
	public void printValue() {
		System.out.println("c1 : " + c1);  // c1 = 1 because this is instance variable and its memory stores in Heap
		
		System.out.println("c2 : " + c2);  // c2 = 3 because this is static variable and its memory stores in static area
	}
}

