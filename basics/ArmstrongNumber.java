package basics;

import java.util.Scanner;

public class ArmstrongNumber {
			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				System.out.println("enter a number to check if it is Armstrong : ");
				int num = sc.nextInt();
				
				int temp = num; // duplicate variable of num
				int count = 0,digit,sum = 0;
				// to count no of digits
				while(temp > 0) {  
					count++;
					temp = 	temp/10;
				}
				temp = num;
				
				// get single digit
				
				while(temp > 0) {
					digit = temp%10;
					int pro = 1;
//					System.out.println(digit);
					for(int i = 0;i<count;i++) {
						pro = pro * digit;
					}
					sum +=pro;
					temp = temp/10;
				}
				if(num == sum) {
					System.out.println(num + " is an Armstrong Number");
				}else {
					System.out.println(num + " is not an Armstrong Number");
				}
			}
}
