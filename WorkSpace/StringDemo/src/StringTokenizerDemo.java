import java.util.StringTokenizer;
public class StringTokenizerDemo {

	public static void main(String[] args) {
		StringTokenizer str = new StringTokenizer("Abc:02:9.45-10.30",":");
				System.out.println(str.countTokens());
		while(str.hasMoreTokens()) {
			System.out.println(str.nextToken());
		}

	}

}
