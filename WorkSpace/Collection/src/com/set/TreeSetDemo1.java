package com.set;

import java.util.TreeSet;

public class TreeSetDemo1 {

	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		set.add(23);
		set.add(54);
		set.add(34);
		set.add(234);
		set.add(435);
		set.add(2);
		set.add(435);
		set.add(23);
		
		
		System.out.println(set);
		
		System.out.println("Smallest value : " + set.first());  //2
		System.out.println("Largest value : " + set.last());  //435
		
		System.out.println("Largest value than provided one : " + set.higher(54));  //54
		System.out.println("Smallest value than provided one : " + set.lower(54));  //34
		
		System.out.println("Equal or largest value than the provided one : " + set.ceiling(54));   //54
		System.out.println("Equal or smallest value than the provided one : " + set.floor(24));   //23
		
		

	}

}
