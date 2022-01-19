// Input 2 number & print between divisible number by 3 
import java.util.Scanner;
public class G32
{
  public static void main(String [] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter First Number : ");
    int c = scan.nextInt();


    System.out.println("Enter Second Number : ");
    int d = scan.nextInt();

    int e = 3;

    
    for(int f = c; f<d; f++){
             if(f % e == 0){
            System.out.println(f);
        }
      }
   
  }
}