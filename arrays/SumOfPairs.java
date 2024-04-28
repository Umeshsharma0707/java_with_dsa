package arrays;

import java.util.Scanner;

public class SumOfPairs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		ArrayMethods.InputUserArray(arr, size);
		ArrayMethods.printArray(arr);
		
		System.out.println("enter element to find total pairs \nwhose sum is equal to x");
		int x = sc.nextInt();
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				int sum = arr[i] + arr[j];
				if(x == sum) {
					count++;
				}
			}
		}
		if(count != 0) {
			System.out.println("total pairs are : " + count);
		}else {
			System.out.println("no pair found");
		}
	}
}
