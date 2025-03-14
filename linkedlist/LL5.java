// Define the Node class
class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Define the Linked List class
public class LL5
 {
    private Node head;

    // Recursive method to reverse the linked list
    public Node reverseListRecursive(Node head) {
        // Base case: empty node or last node
        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = reverseListRecursive(head.next);

        head.next.next = head;
        head.next = null;
        
        return newHead;
    }

    // Method to reverse the linked list using recursion and update head
    public void reverseList() {
        head = reverseListRecursive(head);
    }

    // Method to insert a node at the end of the list
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Method to print the linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LL4 list = new LL4();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);

        System.out.println("Original List:");
        list.printList();

        // Correctly updating the head reference after reversal
        list.reverseList();

        System.out.println("Reversed List:");
        list.printList();
    }
}
