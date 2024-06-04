package oops;


class Dog{
	String dogName;
	String breed;
	
	Dog(){
	}
	Dog(String dogName, String breed){
		this.dogName = dogName;
		this.breed = breed;
	}
	
	void printData() {
		System.out.println("Dog Name : " + dogName);
		System.out.println("Breed : " + breed);
	}
	
	// getter and setter for modify attributes
	
	public void setDogName(String dogName) {
		this.dogName = dogName;
	}
	
	public String getDogName() {
		return this.dogName;
	}
	
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
	public String getBreed() {
		return this.breed;
	}
	
}
public class ModifyAttributes {
	public static void main(String[] args) {
		Dog d1 = new Dog();
		
		d1.setDogName("tommy");
		d1.setBreed("german sephard");
		
		d1.printData();
	}
}
