package arrays;

class Arrayss{
		
	public void singleArr(){

		int id[] = new int[3];

		id[0] = 10;
		id[1] = 11;
		id[2] = 12;

		String[] names = { "umesh", "ram", "shyam" };
		System.out.println(id[0]);
		System.out.println(names[0]);
	}
	
	public void multiArr() {
		int[][] arr = new int[3][2];
		
		
		arr[0][0]=1;
		arr[0][1]=2;
		
		arr[1][0]=3;
		arr[1][1]=4;
		
		arr[2][0]=5;
//		arr[2][1]=6;
//		arr[2][1]=10;
		
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);

		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
		
		System.out.println(arr[2][0]);
		System.out.println(arr[2][1]);
		System.out.println(arr.length);
		
		int[] a = new int[2];
		System.out.println(a.length);
	}
}

public class ArrayDeclaration {

	public static void main(String[] args) {
		Arrayss arr = new Arrayss();
		arr.singleArr();
		arr.multiArr();
	}

}
