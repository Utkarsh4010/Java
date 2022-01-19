package iteration;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionGenericType {

	public static void main(String[] args) {
	      ArrayList<Integer> list = new ArrayList<Integer>();
	      list.add(345);
	      list.add(44);
	      list.add(34);
	      list.add(35);
	      list.add(3);
	      list.add(44);
	      
//	      Iterator it = list.iterator();
//	      while(it.hasNext()) {
//	    	  System.out.println(it.next());
//	      }
	      
	      Iterator<Integer>it = list.iterator();
	      while(it.hasNext()) {
	    	  int value = it.next();
	    	  if(value % 2 == 0) {
	    		  System.out.println(value);
	    	  }
	      }

	      

	}

}
