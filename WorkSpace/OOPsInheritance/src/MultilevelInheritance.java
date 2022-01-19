
public class MultilevelInheritance {

	public static void main(String[] args) {
		
     Audi audi = new Audi();
     audi.printDetails();
	}

}

class Vehicle{
	String vehicleType = "Petrol, diesel, CNG, EV";
	public Vehicle() {
		System.out.println("I am a Vehicle class Constructor");
	}
}

class Car extends Vehicle{  // Car IS-A Vehicle
	String carTypes = "Normal Car,SUV cars";
	public Car() {
		System.out.println("I am Car class Costructor ");
	}
	
}

class Audi extends Car{
	String model = "A8-Petrol";
	public Audi() {
		System.out.println("I am Audi class Constructor");
	}
	public void printDetails() {
		System.out.println("Audi Model :"+ model);
		System.out.println("Car Types :"+ carTypes);//Parent Class Property
		System.out.println("Vehicle Type :"+ vehicleType);//Grand-Parent Class Property
	}
}