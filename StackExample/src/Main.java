import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        // Creating a new stack
        Stack<Integer> stack = new Stack<>();

        // Adding numbers to the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Looking at the top number without taking it off
        System.out.println("\nTop number (peek): " + stack.peek());

        // Taking the top number off
        System.out.println("Number taken off (pop): " + stack.pop());

        // Looking at the new top number
        System.out.println("New top number (peek): " + stack.peek());
    }
}
