public class GSmallestNo
{
  public static void main(String [] args)
   {
    int a = 23;
    int b = 34;
    int c = 78;
    int d = 67;
    System.out.println("Greatest no:");
    if(a > b && a > c && a > d)
    {
     System.out.println(a);
    }
     else if
     (b > a && b > c && b > d)
     {
     System.out.println(b);
     }
     else if(c > a && c > b && c > d)
     {
      System.out.println(c);
     }
    else
     {
      System.out.println(d);
     }   



      System.out.println("Smallest no :");
    if(a < b && a < c && a < d)
    {
     System.out.println(a);
    }
     else if
     (b < a && b < c && b < d)
     {
     System.out.println(b);
     }
     else if(c < a && c < b && c < d)
     {
      System.out.println(c);
     }
    else
     {
      System.out.println(d);
     }
   }

}