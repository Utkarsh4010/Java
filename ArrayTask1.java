public class ArrayTask1
{
 public static void main(String [] args)
   {

    int no [] = {78, 58, 22, 25, 45, 58, 56, 54, 57, 54};
    
   
    System.out.println("total no.");
    for(int i = 0; i <= no.length-1; i++)
      {
        System.out.print(no[i] + " ");

      }
      System.out.println();
    
       System.out.println("length of array");
       System.out.println(no.length);


      System.out.println("Even index number");
      for(int i = 0; i <= no.length-1; i = i + 2 )
      {
        System.out.println(no[i]);
      }


      System.out.println("odd index number");
     for(int i = 1; i <= no.length -1; i = i + 2)
     {
       System.out.println(no[i]); 

     }
      
     System.out.println("square of all index value");
     for(int i = 1; i <= no.length-1; i = i + 2)
     {
       System.out.println(no[i] * no[i]);
     }

    System.out.println("odd number in array");
    for(int i = 0; i <= no.length-1; i++)
     {
      if(no [i] % 2 != 0)
        {
         System.out.println(no[i]);
        }
     }
   }  

}

















