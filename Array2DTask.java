public class Array2DTask
{
   public static void main(String [] args)

   {
    
    int marks[][]= {{98,76,54,54,90},{90,87,67,90,98},{90,89,78,90,98},{98,78,67,89,98},{67,89,78,90,67}};

     double max = 0;
      for(int m = 0; m<=4; m++)   // By Using nested for loop
         {
           
           int sum = 0;
           for(int n = 0; n<=4 ; n++)
                {
                   sum = sum + marks[m][n];
                  
		  System.out.print(marks[m][n] + "\t");
                  
                }
            double percent = sum/5;
                if(percent>max)
              {
                 max = percent;
              }
            System.out.println("|" + percent);
        
         }
      System.out.println("Highest percent is : " + max);

   }


}