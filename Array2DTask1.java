public class Array2DTask1
{
  public static void main(String [] args)
   {
     int marks[][] = {{98,56,76,87,65},{67,89,76,55,46},{45,78,90,99,87},{67,89,98,77,66},{90,98,87,76,66}};
   double max = 0;
    for(int m[]: marks)
       {     
             int sum = 0;
            for(int val: m)
              {
                    sum = sum + val;
                System.out.print(val + "\t");
              }
          double percent = (sum/5);

               if(percent>max)
           {
             max = percent;
           }

         System.out.println("|" + percent);

      
        }
     
          System.out.println("Higher percents is : "+ max);
   }
}