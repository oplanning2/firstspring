package com.javaspring;

public class A {
	
	private static final A obj = new A();
	
	private A() {
		System.out.println("private constructor");
	}

	//factory method
	public static A getA() {
		System.out.println("factory method");
		return obj;
	}
	
	public void message() {
		System.out.println("hello user");
	}
	
	//Autowiring 
   /* B b;
    
	public A() {
		System.out.println("a is created");
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}
	
	void print()
	{
		System.out.println("hello a");
	}
	
	void display() {
		print();
		b.print();
	}*/

}
