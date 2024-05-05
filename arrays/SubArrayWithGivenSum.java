package arrays;

import java.util.Scanner;

public class SubArrayWithGivenSum {
	public static void subArraySum(int arr[],int sum) {
		int currSum;
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				currSum = arr[i] + arr[j];
				if(currSum == sum) {
					System.out.println("sum  found between index " + i + " and " + j );
					break;
				}
				
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of an array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		ArrayMethods.InputUserArray(arr, size);
		ArrayMethods.printArray(arr);
		
		System.out.println("enter sum");
		int sum = sc.nextInt();
		
		subArraySum(arr, sum);
		sc.close();
	}
}
