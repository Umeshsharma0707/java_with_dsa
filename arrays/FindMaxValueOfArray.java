package arrays;
/* FINDING maximum value of an array*/
public class FindMaxValueOfArray {
	public static void main(String[] args) {
		int[] a = {11,95,153,42,36,45};
		
		int maxValue = 0;
		for(int i = 0; i < a.length; i++) {
			if(a[i] > maxValue) {
				maxValue = a[i];
			}
		}
		System.out.println("Max value : " + maxValue);
	}
}
