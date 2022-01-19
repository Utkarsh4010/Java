import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingJDK7 {

	public static void main(String[] args) {
		try (
			Scanner scan = new Scanner(System.in);
			//FileInputStream stream = new FileInputStream("D://test.txt");
			){
			scan.next();
		}

	}

}
