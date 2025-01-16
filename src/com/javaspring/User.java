package com.javaspring;

public class User {

	private int id;  
	private String name,email;
	public User() {
		
	}
	public User(int id, String name, String email) {
		
		this.id = id;
		this.name = name;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Userid=" + id + " name=" + name + " email=" + email ;
	} 
	
	
}
