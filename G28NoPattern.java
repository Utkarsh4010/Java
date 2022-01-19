/*
   10, 9, 8, 7, 6, 5, 4, 3, 2, 1.
*/

public class G28NoPattern
{
  public static void main(String [] args)
    {
       for(int r = 1; r<=1; r++)
         {
            for(int c = 10; c>=1; c--)
               {
                 System.out.print(c);

                  
          if(c<=10 && c>1)
             {
              System.out.print(", ");
              }
         else
            {
              System.out.print(".");
            }
               }
        }
         
    }

}