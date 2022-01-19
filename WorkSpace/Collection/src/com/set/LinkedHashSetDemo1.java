package com.set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo1 {

	public static void main(String[] args) {
		LinkedHashSet set = new LinkedHashSet();
		
		set.add("Abc");
		set.add(2123);
		set.add("cba");
		set.add("Xyz");
		set.add(345.66);
		set.add(true);
		set.add("Abc");
		set.add(2123);
		
		System.out.println(set);

	}

}
