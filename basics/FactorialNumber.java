package basics;
import java.util.Scanner;
public class FactorialNumber {
	
			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				
				System.out.println("enter a number : ");
				
				int number = sc.nextInt();
				int fact = 1;
				int i = 1;
				while(i<=number) {
					fact = fact * i ;
					i++;
				}
				System.out.println("Fcatorial of " + number + " : " + fact);
				
			}
}
