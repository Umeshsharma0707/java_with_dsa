package arrays;

import java.util.Scanner;

public class IncreasingOrderSortedArrayORNot {
	
	public static boolean isSorted(int[] arr) {
		boolean flag = true;
			
			// is array sorted in increased order
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] < arr[i-1]){
				flag = false;
				break;
			}
		}
		
		return flag;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		ArrayMethods.InputUserArray(arr, size);
		ArrayMethods.printArray(arr);
		
		boolean flag = isSorted(arr);
		if(flag == true) {
			System.out.println("array is sorted in increasing order");
		}else {
			System.out.println("array is not sorted");
		}
	}
}
