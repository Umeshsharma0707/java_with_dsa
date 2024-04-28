package arrays;

import java.util.Arrays;

import arrays.UserInputArray;

public class CopyArray {

	public static void main(String[] args) {
		int[] a = new int[3];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;

		int[] cloneArr = Arrays.copyOf(a, a.length);
		System.out.println("original array");
		UserInputArray.printArray(a);
		System.out.println("clone array ");
		UserInputArray.printArray(cloneArr);
		

		System.out.println("after changing values of clone array");

		cloneArr[0] = 10;
		cloneArr[1] = 20;
		cloneArr[2] = 30;

		System.out.println("original array");
		UserInputArray.printArray(a);
		System.out.println("clone array");
		UserInputArray.printArray(cloneArr);

	}
}
