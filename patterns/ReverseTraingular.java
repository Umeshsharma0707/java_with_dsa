package patterns;

import java.util.Scanner;

public class ReverseTraingular {
public static void main(String[] args) {
	Scanner sc  = new Scanner(System.in);
	System.out.println("enter no of rows : ");
	int rows = sc.nextInt();
	
	for(int i = 1; i<= rows; i++) {
		for(int j = 1; j<=rows+1-i;j++) {
			System.out.print("*"); 
		}
		System.out.println();
	}
	
}
}
