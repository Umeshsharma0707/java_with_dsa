package basics;

import java.util.Scanner;

public class PalindromeNumber {
				public static void main(String[] args) {
					String original,reverse = "";
					Scanner sc = new Scanner(System.in);
					
					System.out.println("enter a String/number to check if it is a Palindrome");
					original = sc.nextLine();
					int length = original.length(); // original string length
					
					for(int i = length-1; i>=0;i--) {
						reverse  = reverse + original.charAt(i);
					}
					
					if(original.equals(reverse)) {
						System.out.println(original + ": String is palindrome");
					}else {
						System.out.println(original + ": String is not Palindrome");
					}
				}
}
