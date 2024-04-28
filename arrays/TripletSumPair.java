package arrays;
import java.util.*;
public class TripletSumPair {
	public static int tripletSumPair(int arr[], int target) {
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				for(int k = j + 1; k < arr.length; k++) {
					if(arr[i] + arr[j] + arr[k] == target) {
						count++;
					}
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		ArrayMethods.InputUserArray(arr, size);
		ArrayMethods.printArray(arr);
		System.out.println("enter target value");
		int x = sc.nextInt();
		int output = tripletSumPair(arr,x);
		if(output != 0) {
			System.out.println("total triplet pairs are : " + output);
		}else {
			System.out.println("no triplet pair is found");
		}
	}
}
