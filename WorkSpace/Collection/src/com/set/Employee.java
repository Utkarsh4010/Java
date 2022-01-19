package com.set;

public class Employee extends Object implements Comparable<Employee>{
    private int id;
    private String name;
    public Employee(int id, String name) {
    	this.id = id;
    	this.name=name;
    	
    }
    
    public int getId() {
    	return id;
    }
    
    public String getName() {
    	return name;
    }
    
    @Override
    public boolean equals(Object obj) {
    	Employee e= (Employee)obj;
    	return id ==e.id;
    }
    
    @Override
    public int compareTo(Employee o) {
    	if(id>o.id) {   //1st object value is greater than 2nd object value then return +ve int
    	  return 1;	
    	}
    	else if(id<o.id) {   //1st object value is smaller than 2nd object value then return -ve int
    	return -1;
        }
    	else {    //1st object value equal to 2nd object value then 0
    		return 0;
    		}
    	}
    	


}
