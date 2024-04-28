package patterns;

import java.util.Scanner;

public class DiamondPattern {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter rows : ");
			int rows = sc.nextInt();
			

			for(int i = 0; i < rows; i++) {
				for(int j = 0; j < rows - i - 1; j++) {
					System.out.print(" ");
				}
				for(int j = 0;j <= i; j++) {
					System.out.print("* ");
				}
				System.out.println("");
			}
			
			for(int i = rows-2; i >= 0; i--) {
				for(int j = 0; j < rows - i - 1; j++) {
					System.out.print(" ");
				}
				for(int j = 0;j <= i; j++) {
					System.out.print("* ");
				}
				System.out.println("");
			}
			
			
		}
}
