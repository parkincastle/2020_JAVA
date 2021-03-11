package exam03;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// stack = LIFO(=후입 선출) 구조

public class StackQueEx {

	public static void main(String[] args) {

		Stack<String> stack = new Stack<String>();
		stack.push("a");
		stack.push("b");
		stack.push("c");
		
		System.out.println(stack.peek());
		System.out.println("=========================");
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		System.out.println("=========================");
		
		// Queue = FIFO(선입선출) 구조 ex) 줄 서기
		Queue<String> queue = new LinkedList<>();
		queue.offer("A");
		queue.offer("B");
		queue.offer("C");
		System.out.println(queue.peek());
		System.out.println("=========================");
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		
		
	}

}
