package patterns;

import java.util.Scanner;

public class LeftTriangle {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter rows : ");
		int rows = sc.nextInt();

		rows: for (int i = 0; i < rows; i++) {
			space: for (int j = 0; j < rows - i - 1; j++) {
				System.out.print(" ");
			}
			star: for (int k = 0; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
