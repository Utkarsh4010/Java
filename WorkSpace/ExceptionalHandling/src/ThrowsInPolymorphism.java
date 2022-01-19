import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsInPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class A{
	public void m() throws IOException{
		
	}
	public void m(int a) throws Exception{  //overloading
		
	}
}

class B extends A{
	public void m() throws FileNotFoundException{ //overloading
		
	}
}
