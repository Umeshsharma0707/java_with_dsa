package arrays;

import java.util.Scanner;

public class SumOFArrayElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length of array : ");
		int len = sc.nextInt();
		int arr[] = new int[len];

		int sum = 0; // ans variable

		// getting elements from user

		for (int i = 0; i < arr.length; i++) {
			System.out.println("enter " + (i + 1) + "st element : ");
			int element = sc.nextInt();
			arr[i] = element;
		}

		// traversing array

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		// sum of elements loop
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		System.out.println("sum : " + sum);
	}
}
