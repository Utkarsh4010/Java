public class ConditionalStmt
{
	
	public static void main(String [] args)
	{
	 int age=200;
	 if(age>=1 && age<=120){
	  if(age>=1 && age<=17)
	{
	  System.out.println("teen age");
	}
	 else if(age>=18 && age<=60)
	{
	 System.out.println("adult age");
	}
	 else if(age>=61 && age<=120)	
	{
	System.out.println("old age");
	}
	}
	 else {
	 System.out.println("invalid age");
	}
	}

}