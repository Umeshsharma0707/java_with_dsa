package patterns;

import java.util.Scanner;

public class EvenOddNumPattern {
			public static void main(String[] args) {
				Scanner sc  = new Scanner(System.in);
				System.out.println("enter no of rows : ");
				int rows = sc.nextInt();
				System.out.println("enter no of columns");
				int colms = sc.nextInt();
				
				for(int i = 1; i<=rows; i++) {
					for(int j = 1; j<=colms; j++) {
						if((i+j) % 2 ==0) {
							System.out.print(1);
						}else {
							System.out.print(2);
						}
					}
					System.out.println();
				}
			}
}
