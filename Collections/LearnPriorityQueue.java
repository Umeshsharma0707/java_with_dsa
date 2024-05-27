package collections;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
	public static void main(String[] args) {
		
		Queue<Integer> pq = new PriorityQueue<Integer>(Comparator.reverseOrder());
		// offer to add element in priority queue
		pq.offer(100);
		pq.offer(20);
		pq.offer(30);
		pq.offer(40);
		pq.offer(31);
		
		System.out.println(pq);
		
		System.out.println(pq.poll());
		
		System.out.println(pq);
		
		System.out.println(pq.peek());
		
	}
}
