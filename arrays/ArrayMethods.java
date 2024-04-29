package arrays;

import java.util.Scanner;

public class ArrayMethods {
	public static void InputUserArray(int arr[], int size) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < arr.length; i++) {
			System.out.println("enter " + (i+1) + " th element : ");
			arr[i] = sc.nextInt();
		}
	}
	public static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	public static void FindElementLastOccurence(int arr[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter x to check last occurence ");
		int x = sc.nextInt();
		
		int lastIndex = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == x) {
				lastIndex = i;
			}
		}
		if(lastIndex!=0) {
			System.out.println(x + " is present at  lastIndex = " + lastIndex);
		}else {
			System.out.println(x + " is not found in array");
		}
	}
	public static int[] reverseArray(int arr[]) {
		int reverseArr[] = new int[arr.length]; 
		
		for(int i = arr.length-1; i >=0; i--) {
			reverseArr[arr.length - i-1] = arr[i];
		}
		return reverseArr;
	}
}
