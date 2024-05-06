package arrays;

import java.util.Scanner;

public class ArrayTraversing {
	public static void main(String[] args) {
		int[] a = new int[5];
		Scanner sc = new Scanner(System.in);

		// getting input from user to add elementsa in array
		for(int i = 0; i < a.length; i++) {
			System.out.println("enter element " + (i+1) + " : ");
			int element = sc.nextInt();
			a[i]= element;
		}
		
		// traversing the array
		
		for(int i = 0; i < a.length; i++) {
			System.out.println((i+1) + "st element : " + a[i]);
		}
		
		// getting input from user to add elements in 
		// multi-dimentional array
		
		int[][] b = new int[3][2];
		
		for(int i = 0; i < b.length; i++) {
			for(int j = 0; j < b[i].length; j++) {
				System.out.println("enter "+ (j+1) + "st element of "+ (i+1) + " : ");
				int element = sc.nextInt();
				b[i][j] = element;
			}
		}
		// traversing 2d array
		
		for(int i = 0; i < b.length; i++) {
			for(int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
