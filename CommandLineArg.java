public class CommandLineArg
{
  public static void main(String [] args) 
   {
   System.out.println("Command Line Argument");
    int id = Integer.parseInt(args[0]);
    float salary = Float.parseFloat(args[1]);
    double age = Double.parseDouble(args[2]);
    System.out.println("id : " + id);
    System.out.println("salary : " + salary);
    System.out.println("age : " + age);
   }

}