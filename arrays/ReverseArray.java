package arrays;

import java.util.Scanner;

public class ReverseArray {
	
	public static int[] reverseArray(int arr[]) {
		int reverseArr[] = new int[arr.length]; 
		
		for(int i = arr.length-1; i >=0; i--) {
			reverseArr[arr.length - i-1] = arr[i];
		}
		return reverseArr;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of an array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		ArrayMethods.InputUserArray(arr, size);
		ArrayMethods.printArray(arr);
		
		
		int revArr[] = reverseArray(arr);
		System.out.println("printing reverse array");
		ArrayMethods.printArray(revArr);
		
		System.out.println("another method using j variable");
		int j = 0;
		int ans[] = new int[arr.length];
		for(int i = arr.length-1; i >=0; i--) {
			ans[j] = arr[i];
			j++;
		}
		ArrayMethods.printArray(ans);
	}
}
