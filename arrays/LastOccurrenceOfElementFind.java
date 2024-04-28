package arrays;
import java.util.Scanner;


public class LastOccurrenceOfElementFind {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size of array");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		ArrayMethods.InputUserArray(arr, size);
		ArrayMethods.printArray(arr);
		
		ArrayMethods.FindElementLastOccurence(arr);
		
	}
}
