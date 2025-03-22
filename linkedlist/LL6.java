// Definition for singly-linked list node
class ListNode {
    int val;
    ListNode next;
    
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LL6 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Edge case: If there's only one node and we need to remove it
        if (head == null || (head.next == null && n == 1)) {
            return null;
        }

        int size = 0;
        ListNode temp = head;
        
        // Calculate the size of the linked list
        while (temp != null) {
            temp = temp.next;
            size++;
        }

        // If removing the first node (head)
        if (n == size) {
            return head.next;
        }

        // Find the previous node of the node to be deleted
        int ptf = size - n;  // Position to find
        ListNode prev = head; // Previous node
        int cp = 1;           // Current position

        while (cp < ptf) { // Fixing the loop condition
            prev = prev.next;
            cp++;
        }

        // Delete the target node
        prev.next = prev.next.next;
        return head;
    }

    
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original List:");
        printList(head);

        LL6 solution = new LL6();
        int n = 2; // Remove the 2nd node from the end
        head = solution.removeNthFromEnd(head, n);

        System.out.println("List after removing " + n + "th node from end:");
        printList(head);
    }
}
