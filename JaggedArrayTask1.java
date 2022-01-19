public class JaggedArrayTask1
{
   public static void main(String [] args)
     {
       double cost[][] = {
                           {99.99,50},{98.50,50,99.99},{999,99},{300,234,500,300},{60,40,500}
                         };

         double max = 0;
        for(int r = 0; r<cost.length; r++)
            {
              double sum = 0;
                for(int c = 0; c<cost[r].length; c++)
                 {
                        sum = sum + cost[r][c];
                     
                       if(max<sum)
                         {
                               max = sum;
                         }
                     System.out.print(cost[r][c] + "\t");
                 }
               System.out.println("|" + sum);

            }
      
      System.out.println("Highest cost paid :" + max);
     }

}