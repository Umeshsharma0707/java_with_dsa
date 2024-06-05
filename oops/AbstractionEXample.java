package oops;

abstract class Car{
	
	int price;
	
	abstract void start();
	
	void brake() {
		System.out.println("car is stopping");
	}
}

class Audi extends Car{

	@Override
	void start() {
		System.out.println("Audi is starting");
	}
	
}
class BMW extends Car{
	@Override
	void start() {
		System.out.println("BMW is starting");
	}
}
public class AbstractionEXample {
	public static void main(String[] args) {
		BMW bmw = new BMW();
		
		bmw.start();
		bmw.price = 5000000;
		
		System.out.println(bmw.price);
	}
}
