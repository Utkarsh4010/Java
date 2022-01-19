public class Array1D1
{
  public static void main(String [] args)
  {
   int marks[] = {54, 70, 80, 56, 86};
   
   int sum = 0;
   for(int i = 0; i<=4; i++)
     {
       System.out.println(marks[i]);
       sum = sum+marks[i];

     }
       System.out.println("=========");
       System.out.println(sum/5);
  }


}