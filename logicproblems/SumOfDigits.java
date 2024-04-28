package logicproblems;

import java.util.Scanner;


public class SumOfDigits {
			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				
				System.out.println("enter a digit : ");
				int num = sc.nextInt();
				
				int oNum = num; // original number duplicate
				int sum = 0;
				while(num > 0) {
					sum = sum + num%10;
					num = num/10;
				}
				System.out.println(sum);
			}
}
