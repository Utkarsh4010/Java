public class CommandLineArgs
{
  public static void main(String [] args)
   {
      System.out.println("Commmand line argument");
      int id = Integer.parseInt(args[0]);
      float salary = Float.parseFloat(args[1]);
      System.out.println("Id : "+ id);
      System.out.println("Salary : " + salary);
   }
}