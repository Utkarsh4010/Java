/*
********
*******
******
*****
****
***
**
*
*/

public class G23StarPattern
{
  public static void main(String [] args)
    {
      for(int r = 1; r<=8; r++)
        {
          for(int c = 8; c>=r; c--)
           {
              System.out.print("*");

           }
      System.out.println();
        }
    }

}