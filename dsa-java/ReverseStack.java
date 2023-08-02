import java.util.Stack;

public class ReverseStack {

    public static void reverseStack(Stack<Integer> inputStack) {
        if (inputStack.isEmpty()) {
            return; // Nothing to reverse for an empty stack
        }

        Stack<Integer> auxiliaryStack = new Stack<>();

        // Transfer elements from inputStack to auxiliaryStack
        while (!inputStack.isEmpty()) {
            auxiliaryStack.push(inputStack.pop());
        }

        // Transfer elements back to inputStack (now in reversed order)
        while (!auxiliaryStack.isEmpty()) {
            inputStack.push(auxiliaryStack.pop());
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("Original Stack: " + stack);
        reverseStack(stack);
        System.out.println("Reversed Stack: " + stack);
    }
}
