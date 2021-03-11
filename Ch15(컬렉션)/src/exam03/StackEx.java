package exam03;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {

		Stack<Coin> stack = new Stack<Coin>();
		stack.push(new Coin(100));
		stack.push(new Coin(10));
		stack.push(new Coin(500));
		stack.push(new Coin(100));
		stack.push(new Coin(500));
		
		while(!stack.isEmpty()) {
			Coin coin = stack.pop();
			System.out.println("²¨³» ¿Â µ¿Àü : " + coin.getValue());
		}
		
		
	}

}
