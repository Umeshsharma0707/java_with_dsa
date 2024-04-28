package patterns;

import java.util.Scanner;

public class HoloTriangularNumPattern {
		public static void main(String[] args) {
			Scanner sc  = new Scanner(System.in);
			System.out.println("enter no of rows : ");
			int rows = sc.nextInt();
			
			for(int i = 1; i <= rows; i++) {
						// prints space
						for(int j = 1; j <= rows-i;j++) {
							System.out.print(" ");
						}
							// prints i 
						for(int j = 1; j <=(2*i-1); j++) {
							if(j ==1 || i ==rows || j == 2*i-1) {
								System.out.print(i);
							}else {
								System.out.print(" ");
							}
						}
				System.out.println();
			}
		}
}
