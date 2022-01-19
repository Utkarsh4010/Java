public class  ElseIf
{
    public static void main(String [] args)
    {
     int a = 25;
     if(a >= 1 && a <= 18)
       {
         System.out.println("little age");
       }
     else if(a >= 19 && a <= 60)
      {
       System.out.println("adult age");
      }
     else if(a >= 61 && a <= 120)
     {
       System.out.println("old age");
     }
      else
     {
       System.out.println("Default age");
     }

    }


}