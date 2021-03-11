package exam03;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// stack = LIFO(=���� ����) ����

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
		
		// Queue = FIFO(���Լ���) ���� ex) �� ����
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
