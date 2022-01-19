
public interface MultipleInheritanceByInterface {
	public static void main(String [] args) {
		
	}

}

interface I1{
	public void m1();
}

interface I2{
	public void m2();
	
}

interface I3{
	public void m3();
}

// one interface can extends more than one interface at a time
interface I4 extends I1, I2{
	
}

//one class can implements more than one interface at a time
abstract class C1 implements I1, I2, I3{
	
}

//one class can extends another class and implements more than one interface at a time
abstract class C2 extends C1 implements I1, I2, I3, I4{
	
} 
