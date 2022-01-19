
public class SuperKeyword {

	public static void main(String[] args) {
		Child c = new Child();
		c.show();
		

	}

}

class parent{
	int x = 20;
	public void print() {
		System.out.println("From class parent");
	}
}

class Child extends parent{
	int x = 50;
	public void print() {
		System.out.println("From class chield");

	}
	public void show() {
		int x = 15;
		System.out.println("x : "+ x);//15
		System.out.println("x : "+ this.x);//50
		System.out.println("x : "+ super.x);//20
		print();   //child class
		super.print(); //parent class
	}
	
}
