public class SimpleLinkedList {
    private Node head;
    private int size;

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public SimpleLinkedList() {
        head = null;
        size = 0;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    public void remove(int data) {
        if (head == null) {
            return;
        }

        if (head.data == data) {
            head = head.next;
            size--;
            return;
        }

        Node current = head;
        while (current.next != null) {
            if (current.next.data == data) {
                current.next = current.next.next;
                size--;
                return;
            }
            current = current.next;
        }
    }

    public boolean contains(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        SimpleLinkedList linkedList = new SimpleLinkedList();

        linkedList.add(5);
        linkedList.add(10);
        linkedList.add(15);

        System.out.println("Contains 10: " + linkedList.contains(10)); // Output: true
        System.out.println("Contains 20: " + linkedList.contains(20)); // Output: false
        System.out.println("Size: " + linkedList.size()); // Output: 3

        linkedList.remove(10);
        System.out.println("Contains 10: " + linkedList.contains(10)); // Output: false
        System.out.println("Size: " + linkedList.size()); // Output: 2
    }
}
