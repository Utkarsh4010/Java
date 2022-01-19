public class JaggedArray
{ 
  public static void main(String [] args)
    {
     int num[][] = { {45,78,67,56,55}, {78,9,98,78}, {12}, {23,45}
    };
  
    // nested for loop
    for (int c = 0; c < num.length; c++ )
         {
             for (int d = 0; d < num[c].length; d++)
              {
               System.out.print(num[c][d] + "\t");
              }
         System.out.println();

          }
     

    System.out.println("========");



     //nested for each loop

    for(int c[]: num)
       {
          for(int d: c)
           {
             System.out.print(d + "\t");
           }
  System.out.println();
       }
    } 

}