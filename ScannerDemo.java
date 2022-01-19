import java.util.Scanner;
public class ScannerDemo
{
  public static void main(String [] args)
   {
     Scanner scan = new Scanner(System.in);
   
    System.out.println("Enter Id : ");
    int id = scan.nextInt();

    System.out.println("Enter salary : ");
    float salary = scan.nextFloat();

    System.out.println(" Enter password : ");
    float password = scan.nextFloat(); 

    System.out.println(" you Entered Id : " + id);
    System.out.println(" Yoe entered salary : " + salary); 

    System.out.println(" you entered password : "+password);
   }
}