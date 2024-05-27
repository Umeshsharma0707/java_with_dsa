package collections;

import java.util.ArrayDeque;

public class ArrayDequeExample {
		public static void main(String[] args) {
		
			ArrayDeque<Integer> adq = new ArrayDeque<Integer>();
			
			adq.offer(23);
			
			
			System.out.println(adq);
			adq.offerFirst(12);
			
			System.out.println(adq);
			
			adq.offerLast(45);
			System.out.println(adq);
			
			System.out.println("peek first");
			System.out.println(adq.peek());
			
			System.out.println("peek first");
			System.out.println(adq.peekFirst());
			
			System.out.println("peek Last");
			System.out.println(adq.peekLast());
			
			System.out.println("poll first");
			System.out.println(adq.pollFirst());
			System.out.println("poll last");
			System.out.println(adq.pollLast());
			
			adq.clear();
			System.out.println(adq);
		}
		
}
