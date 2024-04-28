package logicproblems;

import java.util.Scanner;

public class ReverseNumber {
			public static void main(String[] args) {
				 Scanner sc = new Scanner(System.in);
				 System.out.println("enter digits : ");
				 int n = sc.nextInt();
				 
				 int ans = 0;
				 while(n > 0) {
					 ans = (ans *10 + n %10);
					 n /=10;
					 System.out.println(ans);
				 }
				System.out.println("reverse numbers are : " + ans);
				 
			}
}
