package logicproblems;

import java.util.Scanner;

public class FactorialofN {
					public static void main(String[] args) {
						Scanner sc = new Scanner(System.in);
						System.out.println("enter a number to find factorial : ");
						int num = sc.nextInt();
						int fact = 1;
						for(int i = 1; i<=num;i++) {
							fact *=i;
							System.out.println("factorial of " + i + " is : " + fact);
						}
						System.out.println(">>>>>>>>>>>>>>>>>>>>>>>");
						System.out.println("factorial of " + num + " is : " + fact);
					}
}
