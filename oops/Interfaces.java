package oops;

public class Interfaces implements Bike,Human {
	public static void main(String[] args) {
		
		Interfaces i = new Interfaces();
		i.start();
		i.walks();
	}

	@Override
	public void start() {
		System.out.println("bike is starting");
	}

	@Override
	public void walks() {
		System.out.println("human is walking");
		
	}
}

interface Bike{
	void start();
}

interface Human{
	void walks();
}