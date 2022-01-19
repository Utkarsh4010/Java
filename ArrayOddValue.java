public class ArrayOddValue
{
  public static void main(String [] args)
   {
     int marks[] = {58, 89, 23, 87, 88, 22, 55, 44, 88, 65};
      for(int i = 0; i <= marks.length-1; i++)
        {
          System.out.print(marks[i] + " ");
        }
         System.out.println();
       System.out.println("===========odd values from marks========");

        
  
     for(int i = 0; i <= marks.length-1; i++)
     {
    if(marks[i] % 2 != 0)
     {
      
       System.out.println(marks[i] );
     }
    }
   }



}