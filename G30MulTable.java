import java.util.Scanner;
public class G30MulTable
{
  public static void main(String [] args)
   {
      Scanner scan = new Scanner(System.in); 
      System.out.println("Enter First Number : " );
        int d = scan.nextInt();

      System.out.println("Enter Second Number : " );
        int e = scan.nextInt();
              for(int f=d+1; f<e; f++){
               
                 
                    for(int i = 1; i<=10; i++)
                  {
                 System.out.println( f + "*" + i + "=" + (f*i));
                  }
		System.out.println();
             }
           
             
       
   }
}