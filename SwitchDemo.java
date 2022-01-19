/*
 month = 1,3,5,7,8,10,12  : this month has 31 days
 month = 2 : this month has 28 or 29 days
 month = 4,6,9,11 : this month has 30 days
*/

public class SwitchDemo
{
    public static void main(String [] args)
    {
	int month = 2;
	switch(month)
	{
	 case 1 :
	       System.out.println("This month has 31 days");
	       break;

	 case 2 :
	       System.out.println("This month has 28 or 29 days");
	       break;

	 case 3 : 
	       System.out.println("This month has 30 days");
	       break;

	 default :
	       System.out.println("this month is invalid");


	}

    }

}