package collections.list;

import java.util.LinkedList;

public class LinkedListExample {
	public static void main(String[] args) {
		
		// linked list implements List interface and Deque interface
		
		LinkedList<String> ll = new LinkedList<String>();
		
		ll.add("A");
		ll.add("B");
		ll.add("C");
		ll.add("D");
		ll.add("E");
		ll.addFirst("F");
		ll.addLast("G");
		
		
		System.out.println(ll);
		
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll);
		
		ll.addFirst("first");
		ll.addLast("Last");
		System.out.println(ll);
		
		System.out.println(ll.getFirst());;
		System.out.println(ll.getLast());
		
		System.out.println(ll.contains("A"));;
	}
}
