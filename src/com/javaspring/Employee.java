package com.javaspring;

public class Employee {
	private int id;  
	private String name;
	private Address address;//Aggregation
	
	
	//dependency injection by setter method
	//private String city;
	
	//constructor injection
	/*
	public Employee() {
		
	}

	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}


	public Employee(int id, String name, Address address) {
		super();
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
	*/
	/*
	void show(){  
	    System.out.println(id+" "+name); 
	    //Constructor Injection with Dependent Object
	    //System.out.println(address.toString());
	  //Inheriting Bean in Spring
	    System.out.println(address);
	}*/
	
	//setter injection
	/*
	void display() {
		System.out.println(id+" "+name+" "+city); 
	}*/

	void displayInfo() {
		System.out.println(id+" "+name); 
		System.out.println(address); 
	}
	public Employee() {
		super();
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	/*
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	} */
}
