package com.javaspring;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource; 

public class Test {  
public static void main(String[] args) {  
    Resource resource=new ClassPathResource("applicationContext.xml");  
    XmlBeanFactory factory=new XmlBeanFactory(resource);  
      
    Student student=(Student)factory.getBean("studentbean");  
    student.displayInfo();  
}  
} 
