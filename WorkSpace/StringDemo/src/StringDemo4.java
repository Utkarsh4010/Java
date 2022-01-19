
public class StringDemo4 {

	public static void main(String[] args) {
		String str = "String in Java String is class in Java";
		String arr[] = str.split(" ");
		/*
		 * index  value
		 * 0       string
		 * 1       in
		 * 2       java
		 */
		
		for(int i = 0; i<arr.length;i++) {
            System.out.println(arr[i]);
		}
		
		String empId = "P2548";
		if(empId.startsWith("P")){
			System.out.println("Contarct employee");
		} else {
			System.out.println("Permanent employee");
		}
		
		String empId2 = "2330887P";
		if(empId2.endsWith("P")) {
			System.out.println("Permanent Employee");
		} else {
		System.out.println("Contaract Employee");
		}
		
		System.out.println(str.replaceAll("Java", "C++"));
		System.out.println(str.replaceFirst("Java", "C++"));
		
		String str2 = " ";
		System.out.println(str2.isEmpty());
		//System.out.println(str2.isBlank());      java11
		
	}

}
