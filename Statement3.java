public class Statement3
{
   public static void main(String [] args)
   {
	int age = 110;
	
	if(age<=17)
	{
	  System.out.println("teen age");
	}
	
	else if(age>=18 && age<=40)
	{
	 System.out.println("adult age");
	}
	
	else if(age>=41 && age<=100)
	{
	  System.out.println("old age");
	}

        else
	{
          System.out.println("invalid age");
	}
   }


}