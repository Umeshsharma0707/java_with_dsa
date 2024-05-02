package arrays;

import java.util.Scanner;

public class RotateArray {

	public static int[] rotatedArray(int arr[],int k) {
		k %=arr.length;
		int[] rotatedArr = new int[arr.length];
		int j = 0;
		for(int i = arr.length - k; i < arr.length; i++) {
			rotatedArr[j++] = arr[i];
		}
		for(int i = 0; i < arr.length - k; i++) {
			rotatedArr[j++] = arr[i];
		}
		
		return rotatedArr;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of an array");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		ArrayMethods.InputUserArray(arr, size);
		System.out.println("Original Array");
		ArrayMethods.printArray(arr);
	
		System.out.println("enter no of times to rotate an elemnet");
		int k = sc.nextInt(); 
		
		System.out.println("rotated array");
		int output[] = rotatedArray(arr, k);
		ArrayMethods.printArray(output);
		
		sc.close();
	}

}
