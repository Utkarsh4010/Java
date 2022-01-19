package com.list;

import java.util.ArrayList;

public class ArrayListDemo1 {

	public static void main(String[] args) {
       ArrayList nameList = new ArrayList();
       
       nameList.add("Abc");
       nameList.add("Xyz");
       nameList.add("Lmn");
       nameList.add("Abc");
       nameList.add("Pqr");
       
       //can add value in any index, and the value present inside the index will be shifted to the next index
       nameList.add(1, "Test1");
       
       //remove the value from the specific index, the next index values will be shifted to the front side
       nameList.remove(3);
       
       //can get the value from the specific index
       System.out.println((nameList.get(2)));
       
       
       //set will replace the value from the specific index
       nameList.set(1, "Demo");

       
       System.out.println(nameList);
	}

}
