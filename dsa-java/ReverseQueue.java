import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

public class ReverseQueue {

    public static void reverseQueue(Queue<Integer> inputQueue) {
        if (inputQueue.isEmpty()) {
            return; // Nothing to reverse for an empty queue
        }

        Stack<Integer> auxiliaryStack = new Stack<>();

        // Transfer elements from inputQueue to auxiliaryStack
        while (!inputQueue.isEmpty()) {
            auxiliaryStack.push(inputQueue.poll());
        }

        // Transfer elements back to inputQueue (now in reversed order)
        while (!auxiliaryStack.isEmpty()) {
            inputQueue.offer(auxiliaryStack.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);

        System.out.println("Original Queue: " + queue);
        reverseQueue(queue);
        System.out.println("Reversed Queue: " + queue);
    }
}
