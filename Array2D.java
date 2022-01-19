public class Array2D
{
  public static void main(String [] args)
  {
   int marks[][] = {{86,89,66,55}, {99,67,88,67}, {90,45,87,89}};

   System.out.println("total no. of rows in 2D");
   System.out.println(marks.length); // total number of rows in 2D 

   System.out.println("total no. of column from 1 row in 2D");
   System.out.println(marks[2].length); // total number of column from 1 row in 2D.given index

   for(int r = 0; r <= 2; r++) // nested for loop
      {
        for(int c = 0; c <= 3; c++)
          {
              System.out.print(marks[r][c] + "\t");
          }
      System.out.println();

      }

   System.out.println("==============");
   
   for (int r[]:marks)  // nested for each loop
     {
       for (int c: r)
         {
           System.out.print(c + "\t");

         }
       System.out.println();
     }
   
  }
}