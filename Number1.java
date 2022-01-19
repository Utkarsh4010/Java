public class Number1
{
  public static void main(String [] args)
    {
      for(int r = 1; r <= 5; r++)
       {
         for(int c = 5; c >= r; c--)
          {
          System.out.print(r);
          }

       
       System.out.println();
      }


      for(int m = 2; m <= 5; m++)
       {
         for(int n = 1; n <= m; n++)
           {
             System.out.print(n);
           }
         System.out.println();

       }
    }



}