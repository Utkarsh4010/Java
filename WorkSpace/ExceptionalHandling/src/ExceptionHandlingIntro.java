import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionHandlingIntro {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		try {
		System.out.println("Enter 1st Number:");
		int num1 = scan.nextInt();
		System.out.println("Enter 2nd Number:");
		int num2 = scan.nextInt();
		
		
		System.out.println("Mul: "+(num1*num2));
		
		try {  // Nested try catch
		System.out.println("Div:"+(num1/num2));
		}
		catch(ArithmeticException ex) {
			System.err.println("You can not divide by 0");
			
		}
		
		System.out.println("Add:"+(num1+num2));
		System.out.println("Sub:"+(num1-num2));
		}
		
		catch(InputMismatchException ex) {
			System.err.println("Please enter numeric values only");
		}
		
		catch(Exception ex) {
			System.err.println("This is for all other exception");
		}
		
		finally {
			System.out.println("This is finally");
			scan.close();
		}
		
		System.out.println("This is the end of Math Operation");

	}

}
