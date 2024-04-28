package patterns;

import java.util.Scanner;

public class RectangularPattern {
					public static void main(String[] args) {
						Scanner sc  = new Scanner(System.in);
						System.out.println("enter no of rows : ");
						int rows = sc.nextInt();
						System.out.println("enter no of columns");
						int colms = sc.nextInt();
						
						for(int i = 1; i<=rows; i++) {
							for(int j = 1; j<=colms; j++) {
								if(i == 1 || i == rows || j ==1 || j == colms) {
									System.out.print("*");
								}else {
									System.out.print(" ");
								}
							}
							System.out.println();
						}
					}
}
