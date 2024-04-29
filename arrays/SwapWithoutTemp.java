package arrays;

import java.util.Scanner;

public class SwapWithoutTemp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter num 1 : ");
		int num1 = sc.nextInt();
		System.out.println("enter num 2 : ");
		int num2 = sc.nextInt();

		System.out.println("before swapping");

		System.out.println("num 1 : " + num1);
		System.out.println("num 2 : " + num2);

		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;

		System.out.println("after swapping...");

		System.out.println("num 1 : " + num1);
		System.out.println("num 2 : " + num2);

	}
}
