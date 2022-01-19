public class JaggedArrayTask

{
   public static void main(String [] args)

    {
      double max = 0;
      double price[][] = {
                           {855.9,76,54,87,100}, {76,89,90,67,100.50,45,60}, {100,45.44}, {56,50,100}, {50,70,50,40,100.60}
                          };
      for(double m[]: price)  //Jagged array by using nested for each loop
            {
               double sum = 0;
               for(double n: m)
                   {
                        sum = sum + n;
                      System.out.print(n + "     \t ");
                   }
                
                    if(sum>max)
                      {
                        max = sum;
                      }
            System.out.println("|" + sum);
            }
      System.out.println("the highest cost is: " + max);

    }

}