package patterns;

import java.util.Scanner;

public class RightTriangle {
				public static void main(String[] args) {
					Scanner sc = new Scanner(System.in);
					System.out.println("enter number of rows : ");
					int rows = sc.nextInt();
					
					rows:
					for(int i = 0;i<rows;i++) {
						colmn:
							for(int j = 0; j<=i;j++) {
								System.out.print("* ");
							}
						System.out.println();
					}
					
				}
}
