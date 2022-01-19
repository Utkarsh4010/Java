
public class AbstractDemo1 {

	public static void main(String[] args) {
		Car car = new Audi_A8EV(); // polymorphic object
		car.brandName();
		car.fuelType();
		car.noOfWheels();
		
		

	}

}

 abstract class Car{
	 public final String  x = "Test String";
	 public Car() {
		 System.out.println("This is class car constructor");
	 }
	 public abstract void brandName();
	 public abstract void fuelType();
	 public static final void noOfWheels() {
		 System.out.println("4 wheels and one spare wheel");
	 }
 }
 
 abstract class Audi extends Car{
	 public void brandName() {
		 System.out.println("Car brand name : Audi");
	 }
 }
 
 class Audi_A8EV extends Audi{
	 public void fuelType() {
		 System.out.println("Audi-A8 is an electric vehicle");
	 }
 }
 
 