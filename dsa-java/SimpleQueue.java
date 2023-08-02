public class SimpleQueue {
    private int[] queueArray;
    private int front;
    private int rear;
    private static final int DEFAULT_CAPACITY = 10;

    public SimpleQueue() {
        queueArray = new int[DEFAULT_CAPACITY];
        front = -1;
        rear = -1;
    }

    public void enqueue(int element) {
        if (rear == queueArray.length - 1) {
            // Queue is full, need to resize the array
            resize();
        }
        if (isEmpty()) {
            front = 0; // Set front to 0 when inserting the first element
        }
        queueArray[++rear] = element;
    }

    public int dequeue() {
        if (isEmpty()) {
            return -1; // Queue is empty, cannot dequeue anything
        }
        int dequeuedElement = queueArray[front];
        if (front == rear) {
            // If there was only one element in the queue
            front = -1;
            rear = -1;
        } else {
            front++;
        }
        return dequeuedElement;
    }

    public int peek() {
        if (isEmpty()) {
            return -1; // Queue is empty, nothing to peek
        }
        return queueArray[front];
    }

    public boolean isEmpty() {
        return front == -1 && rear == -1;
    }

    private void resize() {
        int newCapacity = queueArray.length * 2;
        int[] newArray = new int[newCapacity];
        System.arraycopy(queueArray, front, newArray, 0, size());
        queueArray = newArray;
        rear = size() - 1;
        front = 0;
    }

    public int size() {
        return rear - front + 1;
    }

    public static void main(String[] args) {
        SimpleQueue queue = new SimpleQueue();

        queue.enqueue(5);
        queue.enqueue(10);
        queue.enqueue(15);

        System.out.println("Peek: " + queue.peek()); // Output: 5

        int dequeuedElement = queue.dequeue();
        System.out.println("Dequeued Element: " + dequeuedElement); // Output: 5

        System.out.println("Peek: " + queue.peek()); // Output: 10

        System.out.println("Is Empty: " + queue.isEmpty()); // Output: false

        queue.dequeue();
        queue.dequeue();
        System.out.println("Is Empty: " + queue.isEmpty()); // Output: true

        queue.dequeue(); // Trying to dequeue from an empty queue
        System.out.println("Peek: " + queue.peek()); // Output: -1
    }
}
