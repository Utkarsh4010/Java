package com.list;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.add(123);
		list.add("Abc");
		list.add(456.766);
		list.add(123);
		list.add(4, "Abc");
		list.addFirst(111);
		list.addLast(999);
		
		System.out.println(list);
		
		list.removeFirst();
		list.removeLast();
		
		System.out.println("can get the value from specific index : "+list.get(2));
		
		
		System.out.println(list);
		
		//insert elemente at the first
		list.push(555);
		System.out.println("After push : " + list);
		
		
		//select and remove the first element, will throw NoSuchElementFoundException if list is empty
		System.out.println("pop : " + list.pop());
		System.out.println("After pop : " + list);
		
		
		//select and remove the first element will return null if list is empty
		System.out.println("poll : " + list.poll());
		System.out.println("After poll : " + list);
		
		//select the first element and not remove the element
		System.out.println("peek : " + list.peek());
		System.out.println("After peek : " + list);

	}

}
