package com.javaspring;

public class Employee {
	private int id;  
	private String name;
	private Address address;//Aggregation
	
	
	
	public Employee() {
		super();
	}

	public Employee(int id, String name, Address address) {
		
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public Employee(int id) {
		
		this.id = id;
	}

	public Employee(String name) {
		
		this.name = name;
	} 
	
	void show(){  
	    System.out.println(id+" "+name); 
	    //Constructor Injection with Dependent Object
	    System.out.println(address.toString());
	} 
}
