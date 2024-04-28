package logicproblems;

import java.util.Scanner;

public class SumOfOddEvenSeries {	
				public static void main(String[] args) {
					Scanner sc = new Scanner(System.in);
					System.out.println("enter up to series no...");
					int num = sc.nextInt();
					int ans = 0;
					for(int i = 0; i <= num; i++) {
						if(num % 2 == 0) {
							ans-=i;
						}else {
							ans+=i;
						}
					}
					System.out.println("sum of series 1 -2 + 3 - 4...n is : " + ans);
				}
}
