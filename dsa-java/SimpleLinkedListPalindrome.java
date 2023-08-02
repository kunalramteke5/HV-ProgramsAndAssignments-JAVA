import java.util.Stack;

public class SimpleLinkedListPalindrome {

    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static boolean isPalindrome(Node head) {
        Stack<Integer> stack = new Stack<>();

        // Traverse the linked list and store each element in the stack
        Node current = head;
        while (current != null) {
            stack.push(current.data);
            current = current.next;
        }

        // Traverse the linked list again and compare each element with the top of the stack
        current = head;
        while (current != null) {
            int topElement = stack.pop();
            if (current.data != topElement) {
                return false; // Not a palindrome
            }
            current = current.next;
        }

        return true; // Palindrome
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(2);
        head.next.next.next.next = new Node(1);

        System.out.println("Is Palindrome: " + isPalindrome(head)); // Output: true
    }
}

