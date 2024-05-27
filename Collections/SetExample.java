package collections;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
	public static void main(String[] args) {
		
		
		Set<Integer> set = new HashSet<Integer>();
		
		set.add(10);
		set.add(30);
		set.add(45);
		set.add(56);
		set.add(90);
		set.add(10);
		set.add(65);
		
		System.out.println(set);
		System.out.println(set.contains(60));
		
		set.remove(56);
		System.out.println(set);
		
	}
}
