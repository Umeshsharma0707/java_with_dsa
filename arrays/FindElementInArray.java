package arrays;

import java.util.Scanner;

public class FindElementInArray {
	static void FindElement(int n, int arr[]){
		boolean flag = false;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == n ) {
				System.out.println(n + " is present at index " + i);
				flag = true;
			}
		}
		
		if(flag == false) {
			System.out.println(n + " is not present");
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = {41,52,53,56,95,85,100};
		
		System.out.println("enter element you want to find : ");
		int findElement = sc.nextInt();
		
		FindElement(findElement, arr);
		sc.close();
	}
}
