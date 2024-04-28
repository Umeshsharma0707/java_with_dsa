package basics;

import java.util.Scanner;

public class ScannerClass {
		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("enter name : ");
			String name = sc.nextLine();
			
			System.out.println("enter number");
			
			long number = sc.nextLong();
			System.out.println("Name : " + name);
			System.out.println("Number : " + number);
			char ch = sc.next().charAt(0);
			System.out.println(ch);
			
			
			
		}
}
