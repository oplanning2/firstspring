package com.javaspring;

import java.util.Date;

public class Answer {
	private int id;  
	//private String name;  
	//Added for non String collection
	//private String by;
	
	//Added for non String Map
	private String answer;
	
	//Added for non map collection
	private Date postedDate; 
	
    public Answer() {
		
	}  
	
    public Answer(int id, String answer, Date postedDate) {
		super();
		this.id = id;
		this.answer = answer;
		this.postedDate = postedDate;
	}

	//constructor for non String collection
	/*public Answer(int id, String name, String by) {
		
		this.id = id;
		this.name = name;
		this.by = by;
	}*/
	

   public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	/*public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBy() {
		return by;
	}

	public void setBy(String by) {
		this.by = by;
	}*/

	// constructor for String collection
	/*public Answer(int id, String name, Date postedDate) {
		
		this.id = id;
		this.name = name;
		this.postedDate = postedDate;
	}*/
	public String toString() {
		//Added for  String collection
		//return id+" "+name+" "+postedDate;
		//Added for non String collection
		// return id+" "+name+" "+by;
		//Added for non String Map collection
		 return "Id:"+id+" Answer:"+answer+" Posted Date:"+postedDate;  
	}

	

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Date getPostedDate() {
		return postedDate;
	}

	public void setPostedDate(Date postedDate) {
		this.postedDate = postedDate;
	}
}
