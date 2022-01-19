package com.set;
import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {
		Employee e1 = new Employee(112, "A");
		Employee e2 = new Employee(232, "B");
		Employee e3 = new Employee(435, "C");
		Employee e4 = new Employee(1232, "A");
		Employee e5 = new Employee(112, "B");


		TreeSet set  = new TreeSet();
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		
		System.out.println(set);

		

	}

}
