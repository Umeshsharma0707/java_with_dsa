package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsClass {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println(list);
		System.out.println("min element : " + Collections.min(list));
		System.out.println("max element : " + Collections.max(list));
		System.out.println("frequency of element : " + Collections.frequency(list, 10));
		
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list, Comparator.reverseOrder()); // reverse order
		System.out.println(list);
	}
}
