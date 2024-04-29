package arrays;

import java.util.Scanner;

public class FindSecondLargestNum {
	
	public static void findMax(int arr[]) {
		int maxValue = Integer.MIN_VALUE;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > maxValue) {
				maxValue = arr[i];
				arr[i] = Integer.MIN_VALUE;
			}
		}
		System.out.println("largest value : " + maxValue);
		maxValue = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > maxValue) {
				maxValue = arr[i];
			}
		}
		System.out.println("second largest value: " + maxValue);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		ArrayMethods.InputUserArray(arr, size);
		ArrayMethods.printArray(arr);
		
		findMax(arr);
		
	}

}
