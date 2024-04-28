package basics;

import java.util.Random;
import java.lang.*;

public class RandomValue {
			public static void main(String[] args) {
				Random r = new Random();
				
				int otp = r.nextInt(100000,999999);
				System.out.println(otp);
				
//				int a = (int)(Math.random() * (100000 - 999999 + 1)+999999);
//				System.out.println(a);
			}
}
