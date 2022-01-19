
public class StringTask1 {

	public static void main(String[] args) {
		String str = "Java String";
		System.out.println("Given String : "+ str);
		char array[] = str.toCharArray();
		System.out.println("Reverse String : ");
			
		
		for(int i = array.length-1; i>=0; i--) {
			System.out.print(array[i]);
		}

	}

}
