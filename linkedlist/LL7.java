public class LL7 {
    static class ListNode {
        int val;
        ListNode next;
        
        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public static class PalindromeLinkedList {
        // Get the middle of the linked list
        public ListNode getMiddle(ListNode head) {
            ListNode fast = head;
            ListNode slow = head;
            while (fast != null && fast.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }
            return slow;
        }

        // Reverse a linked list
        public ListNode reverse(ListNode head) {
            ListNode prev = null;
            ListNode curr = head;

            while (curr != null) {
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }
            return prev;
        }

        // Check if the linked list is a palindrome
        public boolean isPalindrome(ListNode head) {
            if (head == null || head.next == null) {
                return true;
            }

            ListNode firstHalfEnd = getMiddle(head);
            ListNode secondHalfStart = reverse(firstHalfEnd);

            ListNode firstHalfStart = head;
            ListNode secondHalfCopy = secondHalfStart;                   // To restore the list later

            while (secondHalfStart != null) {
                if (secondHalfStart.val != firstHalfStart.val) {
                    reverse(secondHalfCopy);                 // Restore the list before returning false
                    return false;
                }
                secondHalfStart = secondHalfStart.next;
                firstHalfStart = firstHalfStart.next;
            }

            reverse(secondHalfCopy);                  // Restore the list
            return true;
        }

        //  method to print a linked list
        public void printList(ListNode head) {
            ListNode temp = head;
            while (temp != null) {
                System.out.print(temp.val + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        PalindromeLinkedList pll = new PalindromeLinkedList();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(1);

        System.out.print("Linked List: ");
        pll.printList(head);

        if (pll.isPalindrome(head)) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is NOT a palindrome.");
        }
    }
}
