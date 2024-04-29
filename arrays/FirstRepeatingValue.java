package arrays;

import java.util.Scanner;

public class FirstRepeatingValue {
	
	public static int firstRepeatNum(int arr[]) {
		int ans = -1;
		
		outerLoop:
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					ans = arr[i];
					break outerLoop;
				}
			}
		}
		return ans;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of an array");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		
		ArrayMethods.InputUserArray(arr, size);
		ArrayMethods.printArray(arr);
		
		int ans = firstRepeatNum(arr);
		
		if(ans!=0 || ans == 0) {
			System.out.println("first repeated value : " + ans);
		}else {
			System.out.println("no repeated value found");
		}
		
		
		
	}

}
