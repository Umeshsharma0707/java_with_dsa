package basics;

public class Factorial {
	
	
		static void factorialNum(int num) {
			int fact =1;  
			for(int i = 1; i<= num; i++) {
				fact*=i;
			}
			System.out.println("Factorial of "+ num + " : " + fact);
		}
		
		public static void main(String[] args) {
			factorialNum(5);
			factorialNum(10);
			
		}
}
