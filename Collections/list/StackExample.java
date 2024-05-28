package collections.list;

import java.util.Stack;

public class StackExample {
	
	static void stackSearch(Stack<Integer> stack, int element) {
		
		
	}
	
	public static void main(String[] args) {
		Stack<Integer> s = new Stack<Integer>();
		
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(45);
		s.push(5);
		
		System.out.println(s);
		
//		System.out.println("peek element : " + s.peek());
		
//		System.out.println("pop element : " + s.pop());
		
		System.out.println(s);
		
		System.out.println(s.search(5));;
		
	}
}
