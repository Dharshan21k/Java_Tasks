package Stacks;
// it follows lifo last in first out allow more than one null value
import java.util.Stack;

public class StackExample {
	public static void main(String args[]) {
		Stack<Integer> stack=new Stack<>();//push,pop,peek O(1)
		stack.push(10);
		stack.push(null);
		stack.push(null);
		System.out.println(stack);
	}

}
