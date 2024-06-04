package oops;

class Person{
	String name;
	int age;
	
	Person(String Name, int Age){
		this.name = Name;
		age = Age;
	}
	
	 void printPerson() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}
	
}
public class PersonClass {
	public static void main(String[] args) {
		// creating object one
		Person p1 = new Person("Umesh", 21);
		
		// creating object two
		Person p2 = new Person("rocky",20);
		
		// invoking print method
		p1.printPerson();
		p2.printPerson();
		
		// manupulate attributes
		p1.name = "rakesh";
		p1.printPerson();
	}
}
