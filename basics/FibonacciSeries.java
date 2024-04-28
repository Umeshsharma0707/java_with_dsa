package basics;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		int a = 0, b = 1, c = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("enter number : ");
		int n = sc.nextInt();

		System.out.println("fibonacci series");
		System.out.print(a + " " + b + " ");
		for (int i = 1; i <= n; i++) {
			c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
			
		}
		System.out.println();
		int x = 0,y = 1, z = 0,num = 10;
		while(z <= num) {
			System.out.println(z);
			x = y;
			y = z;
			z = x + y;
		}

	}
}
