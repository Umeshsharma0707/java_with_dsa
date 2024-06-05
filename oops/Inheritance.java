package oops;

import java.lang.annotation.Target;

class Parent {
	String name;
	int age;
	
	static int counter;
	
	Parent(){
		counter++;
		System.out.println("object is creating");
	}
	
	Parent(String name, int age){
		this();
		this.name = name;
		this.age = age;
	}
	
	// methods/behaviour
	
	void work() {
		System.out.println(name + " is working");
	}
	void  eat() {
		System.out.println(name + " is eating");
	}
}

class Child extends Parent{
	
	
	Child(String name, int age) {
		super(name, age);		
	}
	
	void eat() {
		
		System.out.println("child is eating ");
	}
}

public class Inheritance {
	public static void main(String[] args) {
//		Parent p1 = new Parent("umesh", 21);
//		
//		p1.work();
//		p1.eat();
		
		Child c1 = new Child("c1", 20);
		
		c1.eat();

		
		
		System.out.println("total object created : " + Parent.counter);
	}
}
