public class ArrayOddIndexValues
{
  public static void main(String [] args)
  {
   int [] number = {85, 25, 56, 58, 56, 21, 87, 89, 23, 87};
    for(int count = 0; count <= number.length - 1; count = count + 1)
    {
      System.out.print(number[count] + " ");


    }

    System.out.println();
    System.out.println("Odd values from array : ");



    for(int i = 1; i<= number.length-1; i++)
    {
     System.out.println(number[i]);

    }


  }

}