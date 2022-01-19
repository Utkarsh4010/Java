public class Array1DLoops
{
   public static void main(String [] args)
   {
    int arr[] = {54, 85, 58, 87, 9, 89, 69, 45, 78, 58, 78, 45, 85, 89, 36, 78, 58};
    System.out.println(arr.length);
    System.out.println(arr.length-1);
    
   /*
     for(int i = 0; i <= arr.length - 1; i++)
      {
        System.out.println(arr[i]);

      }
    */

     for(int num : arr)  // for each loop
      {
        System.out.println(num);
      }
   }


}