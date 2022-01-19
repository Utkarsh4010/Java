
public class InterfaceDemo1 {

	public static void main(String[] args) {
		Vehicle vehicle = new HexaEV();//polymorphic object
		vehicle.noOfWheels();
		vehicle.brandName();
		vehicle.fuelType();
		
		

	}

}

interface Vehicle{
	int x = 10;//public static final int x =10;
	void noOfWheels();//public abstract void noOfWheels();
	void brandName();
	public void fuelType();
	
}

abstract class CarVehical implements Vehicle{
	public void noOfWheels() {
		System.out.println("Car is a 4 wheelar");
	}
}

class HexaEV extends CarVehical{
	public void brandName() {
		System.out.println("Brand name: Tata Motors");
	}
	
	public void fuelType() {
		System.out.println("HexaEV is an electric vehical");
	}
}
