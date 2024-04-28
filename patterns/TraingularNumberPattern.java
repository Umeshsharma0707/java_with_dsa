package patterns;

import java.util.Scanner;

public class TraingularNumberPattern {
		public static void main(String[] args) {
			Scanner sc  = new Scanner(System.in);
			System.out.println("enter no of rows : ");
			int rows = sc.nextInt();
			
			for(int i = 1; i <= rows; i++) {
						// prints spaces
					for(int j = 1; j <= rows - i; j++) {
						System.out.print(" ");
					} 
						// prints num pattern ( 1 to i )
					for(int j = 1; j<= i; j++) {
						System.out.print(j);
					}
						// prints num pattern (i-1) to 1
					for(int j = i-1; j>=1;j--) {
						System.out.print(j);
					}
				System.out.println();
			}
		}
}
