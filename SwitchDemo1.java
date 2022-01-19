/*
 month = 1,3,5,7,8,10,12  : this month has 31 days

 month = 2 : this month has 28 or 29 days

 month = 4,6,9,11 : this month has 30 days
*/

public class SwitchDemo1
{
 public static void main(String [] args)
  {
    int month = 50;
    
    switch(month) {
		    case 1 :     case 3 :       case 5 :
		    case 7 :     case 8 :       case 10 :
	       	    case 12 :
			System.out.println("This month has 31 days");
			break;

		    case 2 :
			System.out.println("This month has 28 or 29 days");
			break;

		    case 4 :     case 6 :       case 9 :
		    case 11 :
			System.out.println("This month has 30 days");
			break;

		    default :
			System.out.println("This month has invalid");





		  }



  }





}