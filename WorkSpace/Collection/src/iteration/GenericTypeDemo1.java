package iteration;

import java.util.HashSet;
import java.util.Iterator;

public class GenericTypeDemo1 {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		
		set.add("Abc");
		set.add("pqr");
		set.add("lmn");
		set.add("234");
		set.add("xyz");
		
		System.out.println("========Iterator==========");
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
			
			System.out.println("===========Enhance For Loop==========");
			for(String val:set) {
				System.out.println(val);
			
			
		}

	}

}
