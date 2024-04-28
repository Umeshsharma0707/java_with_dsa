package arrays;

import java.util.Scanner;

public class CountOccurenceOfEleInArray {
	public static void InputUserArray(int arr[], int size) {
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < arr.length; i++) {
			System.out.println("enter " + (i+1) + " th element : ");
			arr[i] = sc.nextInt();
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array : ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		
		InputUserArray(arr,size);
		UserInputArray.printArray(arr);
		
		System.out.println("enter find num of occurence of x : ");
		int x = sc.nextInt();
		
		int count=0;
		for(int i = 0; i < arr.length;i++) {
			if(x == arr[i]) {
				count++;
			}
		}
		System.out.println("no of occurence of "+ x + " : is = " + count);
	}
}
