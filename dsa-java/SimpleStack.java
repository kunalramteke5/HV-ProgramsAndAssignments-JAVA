public class SimpleStack {
    private int[] stackArray;
    private int top;
    private static final int DEFAULT_CAPACITY = 10;

    public SimpleStack() {
        stackArray = new int[DEFAULT_CAPACITY];
        top = -1;
    }

    public void push(int element) {
        if (top == stackArray.length - 1) {
            // Stack is full, need to resize the array
            resize();
        }
        stackArray[++top] = element;
    }

    public int pop() {
        if (isEmpty()) {
            return -1; // Stack is empty, cannot pop anything
        }
        return stackArray[top--];
    }

    public int peek() {
        if (isEmpty()) {
            return -1; // Stack is empty, nothing to peek
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    private void resize() {
        int newCapacity = stackArray.length * 2;
        int[] newArray = new int[newCapacity];
        System.arraycopy(stackArray, 0, newArray, 0, stackArray.length);
        stackArray = newArray;
    }

    public static void main(String[] args) {
        SimpleStack stack = new SimpleStack();

        stack.push(5);
        stack.push(10);
        stack.push(15);

        System.out.println("Peek: " + stack.peek()); // Output: 15

        int poppedElement = stack.pop();
        System.out.println("Popped Element: " + poppedElement); // Output: 15

        System.out.println("Peek: " + stack.peek()); // Output: 10

        System.out.println("Is Empty: " + stack.isEmpty()); // Output: false

        stack.pop();
        stack.pop();
        System.out.println("Is Empty: " + stack.isEmpty()); // Output: true

        stack.pop(); // Trying to pop from an empty stack
        System.out.println("Peek: " + stack.peek()); // Output: -1
    }
}
