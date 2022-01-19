package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HashMapDemo1 {
           public static void main(String [] args) {
        	   HashMap map = new HashMap();
        	   map.put(123, "Abc");
        	   map.put(1.23, 3454);
        	   map.put('A', 34573.4);
        	   map.put(true, "Abc");
        	   map.put(null, "Xyz");
        	   map.put(123, "AAAAA");
        	   map.put(456, null);
        	   
        	   
        	   System.out.println(map);
        	   
        	   System.out.println(map.get(123));
        	   System.out.println(map.containsKey(123));
        	   System.out.println(map.containsValue(999));
        	   
        	   map.remove(456);
        	   System.out.println("After remove : " + map);
        	   
        	   Set allKeys = map.keySet();
        	   System.out.println("Keys :" + allKeys);
        	   
        	   Collection allValues = map.values();
        	   System.out.println("Values : " + allValues);
        	   
        	   System.out.println(map.size());
        	   System.out.println(map.isEmpty());
        	   map.clear();
        	   System.out.println(map);
        	   
           }
}
