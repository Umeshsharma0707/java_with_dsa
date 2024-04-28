package basics;

import java.util.Scanner;

public class IsArmstrongs {
	
		static boolean isArmstrong(int num) {
			boolean flag = false;
			
			int temp = num;
			int count = 0;
			while(temp>0) {
				count++;
				temp = temp/10;
			}
			
			temp = num;
			int digit,sum = 0;
			while(temp>0) {
				digit = temp % 10;
				int pro = 1;
				for(int i = 0;i<count;i++) {
					pro = pro * digit;
				}
				sum = sum + pro;
				temp = temp/10;
			}
			
			if(num == sum) {
				flag = true;
			}else {
				flag = false;
			}
			
			return flag;
		}
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter a limit  : ");
			int nums = sc.nextInt();
			System.out.println("the Armstrong Numbers are : ");
			for(int i = 0;i<=nums;i++) {
				if(isArmstrong(i)) {
					System.out.print(i + " , ");
				}
			}
			
		}
}
