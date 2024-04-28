package basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TakingInput {
		
		public static void main(String[] args) {
			
			
			try {
						InputStreamReader is = new InputStreamReader(System.in);
						BufferedReader br = new BufferedReader(is);
						
						System.out.println("enter name : ");
						
						String name = br.readLine();
						System.out.println(name);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
}
