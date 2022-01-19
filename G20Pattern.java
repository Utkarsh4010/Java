/*
Enter No :
1
1
11
111
1111
11111
111111
1111111
11111111
111111111
*/

import java.util.Scanner;
public class G20Pattern
{
  public static void main(String [] args)
     {
       Scanner scan = new Scanner(System.in);
         
       
      System.out.println("Enter No : ");
      int no = scan.nextInt();

      if(no>=1 && no<=9)
      {
       for(int r = 1; r<=9; r++)
          {
             for(int c = 1; c<=r; c++)
               {
                   System.out.print(no);
               }
       System.out.println();
          }

       
       
      }
     else
        {
           System.out.println("Enter no between 1 to 9");
        }

 
       
     }

}