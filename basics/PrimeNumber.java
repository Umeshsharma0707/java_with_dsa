package basics;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.println("enter a number to check if it  is prime or not : ");
		int num = sc.nextInt();

		if(num ==1 || num ==0) {
			System.out.println(num + " is not a prime number");
		}
		
		if(num>1) {
			for(int i = 1;i<=num;i++) {
				if(num%i == 0) {
					count++;
				}
			}
			String output = (count == 2) ? num + " is a prime number" : num + " not a prime number";
			System.out.println(output);
		}
		
	}

}
