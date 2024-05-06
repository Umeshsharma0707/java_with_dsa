package arrays;

import java.util.Scanner;

public class SortZeroOnesArrayUsingPointers {
	static void sortZerosAndOnes(int arr[]) {
		int i = 0, j = arr.length-1;
		while(i < j) {
			if(arr[i] == 1 && arr[j] == 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
			if(arr[i] == 0) {
				i++;
				
			}
			if(arr[j] == 1) {
				j--;
			}
		}
		ArrayMethods.printArray(arr);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		int size = sc.nextInt(); // array size
		int arr[] = new int[size];
		
		ArrayMethods.InputUserArray(arr, size);
		ArrayMethods.printArray(arr);
		sortZerosAndOnes(arr);
		sc.close();
	
	}
}
