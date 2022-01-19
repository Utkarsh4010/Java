import java.util.InputMismatchException;

public class ExceptionHandlingJDK_7 {

	public static void main(String[] args) {
		try {
			
		}
		
		catch(ArithmeticException | InputMismatchException | NullPointerException ex) {
			System.out.println("Hello");
			
		}

	}

}
