public class SurajDemo5
{
   public static void main(String args[])
    {
       int a = 50;
       int b = 100;

	switch(1)  
                {

           case 1 : 
		   System.out.println("The sum of given number is"  + " " + (a+b));
	
	   case 2 :
		   System.out.println("The substraction of given number is" + " " +(a-b));
		
	   case 3 :
		   System.out.println("The multiplication of given number is" +" " + (a*b));
	  
	   case 4 :
		   System.out.println("The division of given number is"+" "+ (a%b));
			
		   break;

	   default:
		   System.out.println("This is default value");

		}
    }


}