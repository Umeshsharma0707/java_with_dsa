package arrays;

import java.util.Scanner;

public class SwapValueUsingTemp {
	
	public static void swapValues(int num1, int num2) {
		
		System.out.println("before swapping");
		
		System.out.println("num 1 : " + num1);
		System.out.println("num 2 : " + num2);
		
		int temp;
		
		// swaping values
		
		temp = num1; // temp value is same as num 1
		num1 = num2;
		num2 = temp;
		
		System.out.println("after swapping...");
		
		System.out.println("num 1 : " + num1);
		System.out.println("num 2 : " + num2);
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter num 1 : ");
		int num1 = sc.nextInt();
		System.out.println("enter num 2 : ");
		int num2 = sc.nextInt();
		
		swapValues(num1, num2);
	}
}
