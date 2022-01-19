/*
  month = 1,3,5,7,8,10,12 : this month has 31 days
  month = 2 : this month has 28 or 29 days
  month = 4,6,9,11
*/

 public class ConditionalStmt4
{
	public static void main(String [] args)
    {
	int month = 14;
	
 	if (month == 1)
	  {
	   System.out.println("this month has 31 days");
	  }
	
	else if(month == 2)
	  {
	   System.out.println("this month has 28 or 29 days");
	  }

	else if(month == 4)
	  {
	    System.out.println("this month has 30 days");
	  }
	else 
	 {
	   System.out.println("this month is invalid");
	 }
    }
}
	