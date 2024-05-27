package collections;

import java.util.Arrays;

import arrays.ArrayMethods;

public class ArraysClassExample {
	public static void main(String[] args) {
		int arr[] = {5,10,20,35,46};
		ArrayMethods.printArray(arr);
		int index = Arrays.binarySearch(arr, 20);
		
		System.out.println(index);
		
		Arrays.sort(arr);
		
		ArrayMethods.printArray(arr);
		
	}
}
