package iteration;

import java.util.ArrayList;

import java.util.Iterator;

public class ArrayListIteration {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(345);
		list.add("Abcd");
		list.add(3.45);
		list.add(768);
		list.add(7655);
		
		Iterator it = list.iterator();
		
		while(it.hasNext()) {
			Object value = it.next();
			System.out.println(value);
		}
	}

}
