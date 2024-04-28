package basics;

import java.util.Scanner;

public class DecimalToBinary {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter a Decimal Number : ");
			int decimalNum = sc.nextInt();
			int temp = decimalNum;
			
			int binaryNum = 0;
			int power = 1;
			
			while(temp > 0) {
				int parity = temp % 2;
				binaryNum += parity * power;
				temp/=2;
				power*=10;
				
			}
			
			System.out.println("Decimal Number : " + decimalNum);
			System.out.println("Binary Number : " + binaryNum);
			
		}
}
