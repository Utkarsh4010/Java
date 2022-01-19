package com.list;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add("Abc");
		list.add(123);
		list.add("xyz");
        list.add("Abc");
        list.add(new Integer(234));
        list.add(567);
        list.add(new Double (234.67));
        
        System.out.println(list);
        
        boolean flag = list.contains("Abc"); 
        System.out.println("Is value Present :" + flag);
        
        System.out.println("Total values : " + list.size());
        System.out.println("isEmpty : " + list.isEmpty());
        
        list.remove("Abc");  // is remove only one element from the list
        System.out.println("After Remove :" +list);
        
        ArrayList list2 = new ArrayList();
        
        list2.add("pqr");
        list2.add(123);
        
        System.out.println( "List2 : " + list2);
        
        list.addAll(list2);
        System.out.println("After Add All :" + list);
        
        list2.add(456);
        list.removeAll(list);
        System.out.println("After remove all :" + list);
        
        list.clear();
        	System.out.println("After Clear : " + list);
	}

}
