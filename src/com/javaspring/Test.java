package com.javaspring;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource; 

public class Test {  
public static void main(String[] args) {  
    Resource resource=new ClassPathResource("applicationContext.xml");  
    XmlBeanFactory factory=new XmlBeanFactory(resource);  
      
   // Student student=(Student)factory.getBean("studentbean");  
    // student.displayInfo(); 
    
    //Injecting primitive and string-based values
    //Dependency Injection by Constructor 
    //Employee s=(Employee)factory.getBean("e");  
    //s.show();
    
    //Constructor injection with collection
    Question q=(Question)factory.getBean("q");  
    q.displayInfo(); 
    
    //Inheriting Bean in Spring
    //Employee e1=(Employee)factory.getBean("e2");  
    //e1.show();  
    
    //setter injection
    //Employee e1=(Employee)factory.getBean("obj");  
    //e1.display(); 
    
    //setter injection with dependent object
   // Employee e=(Employee)factory.getBean("obj");  
    //e.displayInfo();  
}  
} 
