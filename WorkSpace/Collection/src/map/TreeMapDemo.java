package map;

import java.util.Collection;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap map = new TreeMap();
         
		   map.put(123, "Abc");
	  	   map.put(756, 3454);
	  	   map.put(34, 34573.4);
	  	   map.put(45, "Abc");
	  	   map.put(87, "Xyz");
	  	   map.put(123, "AAAAA");
	  	   map.put(456, null);
	  	   
	  	   System.out.println(map);
	  	   
	  	   System.out.println("========Higher and Lower=========");
	  	   System.out.println(map.higherKey(121));  //123
	  	   System.out.println(map.higherEntry(121));  //123=AAAAA
	  	   
	  	   System.out.println(map.lowerKey(4356));  //756
	  	   System.out.println(map.lowerEntry(87));  //45=Abc
	  	   
	  	   
	  	   
	  	   System.out.println("============Ceiling and Floor=========");
	  	   System.out.println(map.ceilingKey(34));  //34
	  	   System.out.println(map.ceilingEntry(125));  //456=null
	  	   
	  	   System.out.println(map.floorKey(34));  //34
	  	   System.out.println(map.floorEntry(125));  //123=AAAAA
	  	   
	  	   
	  	   System.out.println("=========First and Last========");
	  	   System.out.println(map.firstKey());  //34
	  	   System.out.println(map.firstEntry());  //34=34573.4
	  	   
	  	   System.out.println(map.lastKey());  //756
	  	   System.out.println(map.lastEntry());  //756=3454

	  	   
	  	   




	  	   
	  	   
	  	   

	}

}
