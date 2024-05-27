package collections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueLinkedList {

	public static void main(String[] args) {
		// Queue is an Interface 
		// where Linked List is a class which implements Queue interface
		
		Queue<Integer> queue = new LinkedList<Integer>();
		
		// .offer() function is used to add elements in queue
		
		queue.offer(10);
		queue.offer(20);
		queue.offer(30);
		queue.offer(40);
		queue.offer(50);
		
		System.out.println(queue);
		
		// .poll() is used to remove element from the queue
		System.out.println("removing element : " + queue.poll());
		
		System.out.println(queue);
		
		System.out.println("peek element to : " + queue.peek());
		
	}

}
