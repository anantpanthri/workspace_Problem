package Array;

import java.util.Stack;

public class correctParenthesis {

	public static void main(String[] args) {
		
		String s="()[]{}";

		Stack<Character> stack = new Stack<Character>();
		for (char c : s.toCharArray()) {
			if (c == '(')
				stack.push(')');
			else if (c == '{')
				stack.push('}');
			else if (c == '[')
				stack.push(']');
			else if (stack.isEmpty() || stack.pop() != c) {
			
				System.out.println("not true");
				break ;
				
			}
		}
		System.out.println("true");
		
		
	}

}
