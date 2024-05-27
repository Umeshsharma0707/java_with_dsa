package collections;

import java.security.KeyStore.Entry;
import java.util.HashMap;
import java.util.Map;

public class Maps {
	public static void main(String[] args) {
		
		Map<Integer, String>  students = new HashMap<Integer, String>();
		
		students.put(1, "umesh");
		students.put(2, "rakesh");
		students.put(1, "mahesh");// overrides key 1
		students.put(3, "ram");
		students.put(4, "raju");
		
		students.putIfAbsent(4, "ramesh"); // puts only if 4 key is not found
		
		students.remove(4);
		
		students.isEmpty(); // returns true if Map is empty
		
		System.out.println(students);
		
		// map iteration
		
		for(Map.Entry<Integer, String> e : students.entrySet()) {
			System.out.println(e);
		}
		System.out.println("map keys");
		
		for(Map.Entry<Integer, String> e : students.entrySet()) {
			System.out.println("key : " + e.getKey());
		}
	}
}
