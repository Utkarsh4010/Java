public class ArrayEvenInsex
{
   public static void main(String [] args)
  {
    int [] array = {7, 8, 60, 87, 56, 78, 58, 89, 56, 23};
    for(int num : array)
    {
    System.out.print(num + " " );
    }
    System.out.println();
    System.out.println("========");

 
    System.out.println("values from even index: ");
    for(int i = 0; i <= array.length-1; i = i+2)
    {
     System.out.println(array[i]);
    } 
   
  }


}