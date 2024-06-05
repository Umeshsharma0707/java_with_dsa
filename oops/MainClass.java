package oops;

class AC{
	String name;
	int price;
	
	static int counter;
	AC(){
		counter++;
		System.out.println("creating an object of ac");
	}
	
	void turnON() {
		System.out.println("Ac is turned On");
	}
	
	void turnOF() {
		System.out.println(name + " Ac is turned of");
	}
	void turnOF(int timerHr , int timermin) {
		System.out.println("AC will be turn of after " + timerHr + " hours " + timermin + " minutes" );
	}
}

public class MainClass {
	public static void main(String[] args) {
		AC ac = new AC();
		AC ac1 = new AC();
		ac.price = 21000;
		ac.name = "Hitachi";
		
		System.out.println(ac.name + " " + ac.price);
		
		ac.turnON();
		ac.turnOF();
		ac.turnOF(2,5);
		
		
		System.out.println("total objects " + AC.counter);
	}
}
