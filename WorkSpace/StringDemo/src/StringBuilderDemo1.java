
public class StringBuilderDemo1 {

	public static void main(String[] args) {
		StringBuilder sbr = new StringBuilder("Hello java");
		System.out.println(sbr);
		sbr.append(" Program");
		System.out.println(sbr);
		sbr.insert(11,"String");
		System.out.println(sbr);
        //  sbr.reverse();
        //System.out.println(sbr);
        sbr.replace(6, 11, "C++");
        System.out.println(sbr);
        
        StringBuilder sbr1 = new StringBuilder("java");
        System.out.println(sbr1);
        System.out.println(sbr1.length());
        System.out.println(sbr1.capacity());
        sbr1.append("HelloHelloHello12");
        System.out.println(sbr1.length());
        System.out.println(sbr1.capacity());
	}

}
