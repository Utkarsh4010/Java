package map;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Set;

public class HashTableDemo {

	public static void main(String[] args) {
		Hashtable map = new Hashtable();
		
	   map.put(123, "Abc");
  	   map.put(1.23, 3454);
  	   map.put('A', 34573.4);
  	   map.put(true, "Abc");
  	   map.put(123, "AAAAA");
  	   map.put(456, 56.54);
  	   
  	   System.out.println(map);
  	   
  	   System.out.println(map.get(123));
  	   System.out.println(map.containsKey(123));
  	   System.out.println(map.containsValue(999));
  	   
  	   map.remove(456);
  	   System.out.println("After remove : " + map);
  	   
  	   Set allKeys =  map.keySet();
  	   System.out.println("Keys : " + allKeys);
  	   
  	   Collection allValues = map.values();
  	   System.out.println("Values : " + allValues);
  	   
  	   System.out.println(map.size());
  	   System.out.println(map.isEmpty());
  	   map.clear();
  	   System.out.println("After clear : " + map);
  	   

	}

}
