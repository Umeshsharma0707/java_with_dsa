package arrays;

import java.util.Scanner;

public class RotateOriginalArray {
	public static void reverseToStartEndPoints(int arr[],int start, int end) {
		int j = end;
		int temp;
		for(int i = start; i < j; i++) {
			temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			j--;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of an array");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		ArrayMethods.InputUserArray(arr, size);
		System.out.println("original array before");
		ArrayMethods.printArray(arr);
		
		System.out.println("enter k ");
		int k = sc.nextInt();
		k %= arr.length;
		int n = arr.length;
		
		System.out.println("original array after rotating... " + k + " elemnts");
		reverseToStartEndPoints(arr, 0, n - k - 1);
//		ArrayMethods.printArray(arr);
		reverseToStartEndPoints(arr,n-k,n-1);
//		ArrayMethods.printArray(arr);
		reverseToStartEndPoints(arr,0,n-1);
		ArrayMethods.printArray(arr);
		sc.close();
	}
}
