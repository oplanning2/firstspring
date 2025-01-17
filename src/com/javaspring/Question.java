package com.javaspring;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question {

	private int id;  
	private String name;  
	//constructor injection with string collection
	//private List<String> answers; 
	
	//constructor injection with non string collection
	//private List<Answer> answers;
	
	//constructor injection with Map
	private Map<String,String> answers;  
	
	//constructor injection with Map
	//private Map<Answer,User> answers;
	
	public Question() {
		
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

	//Getter Injection with String  method
	/*public List<String> getAnswers() {
		return answers;
	}*/

	//Setter Injection with non String  method
	/*public void setAnswers(List<Answer> answers) {
		this.answers = answers;
	}*/
	
	//Getter Injection with non String  method
		/*public List<Answer> getAnswers() {
			return answers;
		}*/
	//Getter Injection with String  method
			public Map<String,String> getAnswers() {
				return answers;
			}
		//Setter Injection with String  method
		/*public void setAnswers(List<String> answers) {
			this.answers = answers;
		}*/

		//Setter Injection with Map(String)
				public void setAnswers(Map<String,String> answers) {
					this.answers = answers;
				}
	//constructor injection with string collection
	/*public Question(int id, String name, List<String> answers) {
	super();
	this.id = id;
	this.name = name;
	this.answers = answers;
    }*/

	//constructor injection with non string collection
	/*public Question(int id, String name, List<Answer> answers) {
		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
	}*/
	
	//constructor injection with map(using String)
	public Question(int id, String name, Map<String,String> answers) {
		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
	}
	
	//constructor injection with map
		/*public Question(int id, String name, List<Answer,User> answers) {
			super();
			this.id = id;
			this.name = name;
			this.answers = answers;
		}*/
	
	public void displayInfo(){  
	    System.out.println(id+" "+name);  
	    System.out.println("answers are:"); 
	    
	    // Iterator for  string collection
	     //Iterator<String> itr=answers.iterator();
	    
	    // Iterator for non string collection
	    // Iterator<Answer> itr=answers.iterator();
	    
	    // Iterator for Map collection
	     Set<Entry<String, String>> set=answers.entrySet();  
	     Iterator<Entry<String, String>> itr=set.iterator(); 
	    
	    // Iterator for non String Map collection
	   // Set<Entry<Answer, User>> set=answers.entrySet();  
	    //Iterator<Entry<Answer, User>> itr=set.iterator(); 
	   
	    while(itr.hasNext()){  
	    	//printing for List collection
	       //System.out.println(itr.next());
	    	//printing for Map collection
	        Entry<String,String> entry=itr.next();  
	        System.out.println("Answer:"+entry.getKey()+" Posted By:"+entry.getValue());
	    	
	    	//printing for non String Map collection
	      /*  Entry<Answer,User> entry=itr.next(); 
	        Answer ans=entry.getKey();  
	        User user=entry.getValue();  
	        System.out.println("Answer Information:");  
	        System.out.println(ans);  
	        System.out.println("Posted By:");  
	        System.out.println(user); */
	    }  
	}
	
	
}
