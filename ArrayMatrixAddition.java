public class ArrayMatrixAddition
{
   public static void main(String [] args)
     {
       int matrixA[][] = {{3,4},{2,1}};
       int matrixB[][] = {{1,5},{3,7}};
       int matrixD[][] = new int[2][2];
         System.out.println("matrix A");
          for(int r = 0; r<=1; r++)    // by using nested for loop
            {
               for(int c = 0; c<=1; c++)
                 {
                   System.out.print(matrixA[r][c] + "\t");
                 }
             System.out.println();
            }

         System.out.println("matrix B");
        for(int r = 0; r<=1; r++)
            {
               for(int c = 0; c<=1; c++)
                 {
                   System.out.print(matrixB[r][c] + "\t");
                 }
           System.out.println();
            }
 
       System.out.println("Addition of A & B matrix");
         
        for(int r = 0; r<=1; r++)
          {
            for(int c=0; c<=1; c++)
                 {
                   matrixD[r][c]=matrixA[r][c] + matrixB[r][c];    
                   System.out.print(matrixD[r][c] + "\t");
                 }
      System.out.println();
          }
     }
}