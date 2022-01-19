package com.set;

import java.util.HashSet;

public class HashSetDemo1 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("Abc");
		set.add(2123);
		set.add("cba");
		set.add("Xyz");
		set.add(647557.55);
		set.add(true);
		set.add("Abc");
		set.add(2123);
		
		System.out.println(set);

	}

}
