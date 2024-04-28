package basics;

import java.util.Scanner;

public class BinaryToDecimal {
			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter a Binary Number : ");
				int binaryNum = sc.nextInt();
				int temp = binaryNum;
				
				int decimalNum = 0;
				int base = 1;
				
				while(temp > 0) {
					int lastNum = temp % 10;
					temp = temp/10;
					
					decimalNum += lastNum * base;
					
					base = base *2;
					
				}
				System.out.println("Binary Num : " + binaryNum);
				System.out.println("decimal Num : " + decimalNum);
				
			}
}
