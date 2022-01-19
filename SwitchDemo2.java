/*
  write a program using switch case to print following output
  if days is 1,2,3,4,5 =>its working days
  if days is 6,7 => its a weekend
  if not in 1-7 => invalid day value
*/

public class SwitchDemo2

{
  public static void main(String [] args)
  {
   int day = 6;
   switch(day)
       {
         case 1 :   case 2 :   case 3 :
         case 4 :   case 5 :
         System.out.println("its working days");
         break;

         case 6 :   case 7 :
         System.out.println("its a weekend");
         break;
 
         default :
         System.out.println("invalid day");
       }

  }

}