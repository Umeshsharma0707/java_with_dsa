package Collections;

import java.util.Stack;

public class StackClass {
	public static void main(String[] args) {
		// stack is LIFO(Last In First Out) 
		Stack<Integer> stack = new Stack<Integer>();
		
		// .push() : is used to push an item onto top of stack
		
		stack.push(10); 
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		
		System.out.println(stack);
		
		// .peak() gives which element is at its top
		
		System.out.println(stack.peek()); 
		
		stack.pop();  // to remove element from the top of stack
		
		System.out.println(stack);
		System.out.println(stack.peek());
		
	}
}
