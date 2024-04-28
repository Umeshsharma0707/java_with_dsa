package arrays;

import java.util.Scanner;

public class NumGreaterThanX {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		ArrayMethods.InputUserArray(arr, size);
		ArrayMethods.printArray(arr);
		
		System.out.println("enter number to count the elements strictly greater than value x : ");
		int x = sc.nextInt();
		
		int count = 0; 
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > x) {
				count++;
			}
		}
		
		if(count!=0) {
			System.out.println(count + " : numbers are greater than " + x);
		}else {
			System.out.println("all numbers are smaller than " + x);
		}
		
	}
}
