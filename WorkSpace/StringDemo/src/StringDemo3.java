
public class StringDemo3 {

	public static void main(String[] args) {
		String str = new String("Hello Java");
		String str1 = new String("Program");
		
		System.out.println(str);
		//int count = str.length();
		System.out.println(str.length());
		System.out.println(str.charAt(4));
		System.out.println(str.indexOf('J'));
		
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		
		System.out.println(str);
        System.out.println(str + " " + str1);
        System.out.println(str.concat( str1));
        
        System.out.println("==========");
        String str2 = "This is String in Java";
        int index = str2.indexOf("J");
        System.out.println(str2.substring(index));
        System.out.println(str2.substring(8, 14));
        
        char array[] = str2.toCharArray();
        int counter = 0;
        for(char c : array) {
        	if('i' == c) {
        		counter++;
        	}
        }
        System.out.println("Total Values : " + counter);
         
        System.out.println("===========");
        int a = 20;
        int b = 50;
        System.out.println("add : " + a+b);//add : 2050
        System.out.println("mul : " + a*b);//mul : 1000
		
	}

}
