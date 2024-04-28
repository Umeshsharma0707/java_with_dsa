package patterns;

import java.util.Scanner;

public class PyramidPattern {
		public static void main(String[] args) {
			Scanner sc  = new Scanner(System.in);
			System.out.println("enter no of rows : ");
			int rows = sc.nextInt();
			
			for(int i = 1; i<= rows; i++) {
				for(int j = 0; j<=rows-i;j++) {
					System.out.print(" ");
				}
				for(int j = 0; j< (2*i-1);j++) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
}
