package arrays;

import java.util.Scanner;

public class UserInputArray {
	
	public static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array : ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("enter " + (i+1) + " th element : ");
			arr[i] = sc.nextInt();
		}
		
		int[] arr2 = arr;
		System.out.println("arr 1");
		printArray(arr);
		System.out.println("arr 2");
		printArray(arr2);
		
		System.out.println("after changing values of duplicate array");
		arr2[0] = 0;
		arr[1] = 0;
		
		System.out.println("original array");
		printArray(arr);
		System.out.println("duplicate arr2");
		printArray(arr2);
	}
}
