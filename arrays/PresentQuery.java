package arrays;

import java.util.Scanner;

public class PresentQuery {
	public static int[] makeFrequencyArray(int arr[]) {
		int freq[] = new int[100005];
		
		for(int i = 0; i < arr.length; i++) {
			freq[arr[i]]++;
		}
		return freq;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of an array");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		ArrayMethods.InputUserArray(arr, size);
		ArrayMethods.printArray(arr);
		
		int freq[] = makeFrequencyArray(arr);
		
		System.out.println("enter number of queries");
		int q = sc.nextInt();
		
		while(q > 0) {
			System.out.println("search x");
			int x = sc.nextInt();
			if(freq[x] > 0) {
				System.out.println("yes it's present");
			}else {
				System.out.println("not present");
				
			}
			q--;
		}
		sc.close();
	}
}
