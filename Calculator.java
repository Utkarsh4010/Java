public class Calculator
{
   // Create a method to print addition of 2 numbers
  public void add()
     {
       int a = 20, b = 30;
      System.out.println(a + b);
      return;
     }
  
   // Create a method to accept 2 int number and print the sub for them

   public void sub(int a, int b)
      {
       System.out.println(a - b);
      }

  // Create a method to accept 3 double number and return the multiplication of it
  public double mul(double a, double b, double c)
      {
         double ans = a * b * c;
         return ans;
      }

 // Create a method to which return the division of two int number

   public double div()
     {
       return 23/3;
     }

   public static void main(String [] args)
    {
      System.out.println("Hello user i am Calculator class");
      Calculator calculate;   // declaration (reference variable)
      calculate = new Calculator();  // instance/object/class
 
   // Calculator calculate = new Calculator();

     calculate.add();
     int x = 20;
     calculate.sub(x,10);


     double output = calculate.mul(2.0, 4.5, 5.0);
     System.out.println("mul:"+ output);

    // System.out.println("mul :"+ calculate.mul(2.0, 4.5, 5.0));


    double result = calculate.div();
    System.out.println("Div:" + result);

    }
}