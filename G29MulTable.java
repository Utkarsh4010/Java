/*
7*1=7
7*2=14
7*3=21
7*4=28
7*5=35
7*6=42
7*7=49
7*8=56
7*9=63
7*10=70
*/

public class G29MulTable
{
  public static void main(String [] args)
    {
      for(int c=1; c<=10; c++)
       {
         System.out.println(("7" + "*" + c) + "=" + (7*c));
       }
    }
}