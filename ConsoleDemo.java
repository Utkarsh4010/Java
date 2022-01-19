import java.io.Console;
public class ConsoleDemo
{
 public static void main(String [] args)
  {
   Console con = System.console();
   
   System.out.println("Enter Id : ");
   int id = Integer.parseInt(con.readLine());

   System.out.println("Enter salary : " );
   float salary = Float.parseFloat(con.readLine());

  System.out.println("You entered Id : " + id);
  System.out.println("You entered salary : " + salary);

 System.out.println("Enter password : ");
 char[] pass = con.readPassword();
   
    if(pass.length>=8 && pass.length<=16)
    {
     for(char c : pass)
        {
          System.out.println(c);
        }
    }
    else
      {
        System.out.println("Invalid password, it must be between 8 to 16 char");
      }
  }
}