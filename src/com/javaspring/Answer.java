package com.javaspring;

import java.util.Date;

public class Answer {
	private int id;  
	private String name;  
	//Added for Map collection
	//private String by;
	
	private Date postedDate; 
	
    public Answer() {
		
	}  
	
    //constructor for Map collection
	/*public Answer(int id, String name, String by) {
		
		this.id = id;
		this.name = name;
		this.by = by;
	}*/
	

   // constructor for non Map collection
	public Answer(int id, String name, Date postedDate) {
		
		this.id = id;
		this.name = name;
		this.postedDate = postedDate;
	}
	public String toString() {
		return id+" "+name+" "+postedDate;
	}
}
