package arrays;

import java.util.Iterator;
import java.util.Scanner;

/*
 * sort an Array in assending order consisting 0's and 1's in array
 * */
public class SortArrayOfzerosandOnes {
	static void sortArrayOfzerosndOnes(int arr[]) {
		int zeros = 0;
		int ones = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 0) {
				zeros++;
			}else if(arr[i] == 1) {
				ones++;
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			if(i < zeros) {
				arr[i] = 0;
			}else {
				arr[i] = 1;
			}
		}
		
		System.out.println("printing sorted array of 0's and 1's ");
		ArrayMethods.printArray(arr);
		
//		System.out.println("zeros : " + zeros);
//		System.out.println("ones : " + ones);
	}
	public static void main(String[] args) {
		// array of 0's and 1's
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of an array");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		ArrayMethods.InputUserArray(arr, size);
		
		System.out.println("unsorted Array");
		ArrayMethods.printArray(arr);
		sortArrayOfzerosndOnes(arr);
		
		sc.close();
	}
}
