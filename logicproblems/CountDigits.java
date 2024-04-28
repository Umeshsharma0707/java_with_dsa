package logicproblems;

import java.util.Scanner;

public class CountDigits {
					public static void main(String[] args) {
						
						Scanner sc = new Scanner(System.in);
						System.out.println("enter digits : ");
						int num = sc.nextInt();
						int temp = num;
						int count = 0;
						for(int i = 0; temp > 0; i++) {
							temp = temp/10;
							count++;
						}
						
						System.out.println(num + " total digits : " + count);
					}
}
