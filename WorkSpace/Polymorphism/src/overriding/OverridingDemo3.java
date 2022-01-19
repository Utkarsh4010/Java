package overriding;

public class OverridingDemo3 {

	public static void main(String[] args) {
		Animal a = new Tiger(); //polymorphic object
		a.eat();
		

	}

}

class Animal{
	public void eat() {
		System.out.println("veg and non-veg");
	}
}

class Cat extends Animal{
	
}

class Tiger extends Animal{
	public void eat() {
		System.out.println("Non veg");
	}
}