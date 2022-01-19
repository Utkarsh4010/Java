import java.util.Scanner;
public class StringTask2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter File Name : ");
		String fileName = scan.nextLineString();
		if(fileName.endsWith(".docs")) {
			System.out.println(fileName);
		} else {
			System.out.println("Enter file name .docs type");
		}
			
		
		
	}

}




