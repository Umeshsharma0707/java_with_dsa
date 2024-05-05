package arrays;


import java.util.Scanner;

public class RemoveElement {
	static int[] removeElement(int arr[],int element) {
		int newArr[] = new int[arr.length-1];
		
		for(int i = 0,k=0; i < arr.length; i++) {
			if(arr[i] == element) {
				continue;
			}else {
				newArr[k++] = arr[i];
			}
		}
		return newArr;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of an array");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		ArrayMethods.InputUserArray(arr, size);
		ArrayMethods.printArray(arr);
		
		System.out.println("enter element you want to remove");
		int element = sc.nextInt();
		
		int ans[] = removeElement(arr, element);
		System.out.println("array after removing " + element );
		ArrayMethods.printArray(ans);
		
		sc.close();
	}
}	
