package patterns;

import java.util.Iterator;
import java.util.Scanner;

public class NumberDesgn {
			public static void main(String[] args) {
				Scanner sc  = new Scanner(System.in);
				System.out.println("enter no of rows : ");
				int rows = sc.nextInt();
				
				for(int i = 1; i <=rows;i++) {
					for(int j = i ; j <=rows; j++) {
						System.out.print(j);
					}
					for(int j = 1; j <= i -1; j++) {
						System.out.print(j);
					}
					System.out.println();
				}
			}
}
