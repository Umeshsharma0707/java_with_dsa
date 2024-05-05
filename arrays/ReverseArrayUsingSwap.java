package arrays;

import java.util.Scanner;

public class ReverseArrayUsingSwap {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of an array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		ArrayMethods.InputUserArray(arr, size);
		ArrayMethods.printArray(arr);
		
		int j = arr.length-1; 
		int temp;
		for(int i = 0;i<j;i++) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j--] = temp;
			
		}
		
		ArrayMethods.printArray(arr);
		sc.close();
	}
}
