package arrays;

import java.util.Scanner;

public class FindUniqueNum {
	public static int findUnique(int arr[]) {
		int ans = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					arr[i] = -1;
					arr[j] = -1;
				}
			}
		}
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > 0) {
				ans = arr[i];
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		int size = sc.nextInt();
		int[] arr = new int[size];
		ArrayMethods.InputUserArray(arr, size);
		ArrayMethods.printArray(arr);
		
		int ans = findUnique(arr);
		if(ans!=0) {
			System.out.println("unique number is : " + ans);
		}else {
			System.out.println("no unique number is found");
		}
	}
}
