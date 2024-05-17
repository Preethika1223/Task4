package Collections;

import java.util.Stack;

public class IntegerStack {
    private Stack<Integer> stack;

    public IntegerStack() {
        this.stack = new Stack<>();
    }

    // Method to push an element onto the stack
    public void push(int element) {
        stack.push(element);
        System.out.println(element);
    }

    // Method to pop an element from the stack
    public int pop() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot pop elements.");
        }
        return stack.pop();
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        IntegerStack myStack = new IntegerStack();

        // Pushing elements onto the stack
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);

        // Popping elements from the stack
        System.out.println("Popped: " + myStack.pop()); // Output: 30
        System.out.println("Popped: " + myStack.pop()); // Output: 20

        // Checking if the stack is empty
        System.out.println("Is stack empty? " + myStack.isEmpty()); // Output: false

        // Popping the last element
        System.out.println("Popped: " + myStack.pop()); // Output: 10

        // Checking if the stack is empty
        System.out.println("Is stack empty? " + myStack.isEmpty()); // Output: true
    }
}

