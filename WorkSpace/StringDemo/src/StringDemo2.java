
public class StringDemo2 {

	public static void main(String[] args) {
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		String s3 = "Hello";
		String s4 = "Hello";
		
		//compare 2 non primitive (object) by double equals operator
		//then their memory reference will be compare instead of their values
		
		//== is equality of address check
		System.out.println(s1==s2);//false
		System.out.println(s1==s3);//false
		System.out.println(s3==s4);//true
		
		System.out.println("Hello"==s1);//false
		System.out.println("Hello"==s3);//true
		System.out.println("HELLO"==s1);//false
		System.out.println("HELLO"==s3);//false
		
		System.out.println("==================");
		
		//.equals() chechs equality of value
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equals(s3));//true
		System.out.println(s1.equals(s4));//true
		System.out.println("HELLo".equals(s4));//false
		//.equalsIgnoreCase is ignores the cases
		System.out.println("HELLo".equalsIgnoreCase(s4));//true
		

	}

}
