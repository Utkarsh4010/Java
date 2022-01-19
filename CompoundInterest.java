public class CompoundInterest
{
  public static void main(String [] args)
  {
   int finalAaamount;
   int u = 15000;
   int r = 5;
   int n = 2;
   int t = 3;
   int finalAmount = u*(1+(r/n))^n*t;
   System.out.println(finalAmount);
   
  }

}