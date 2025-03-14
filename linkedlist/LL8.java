public class LL8 {
    
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Function to detect a cycle in the linked list
    public boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;       // Move slow by 1 step
            fast = fast.next.next;  // Move fast by 2 steps

            if (fast == slow) {     // Cycle detected
                return true;
            }
        }
        return false;  // No cycle found
    }

    public static ListNode createCycleList() {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);

        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = second; // Creating a cycle (looping back to second node)

        return head;
    }

    public static void main(String[] args) {
        LL8 cycleChecker = new LL8();

        // Create a linked list with a cycle
        ListNode cycleList = createCycleList();

        // Check if the cycle exists
        System.out.println("Does the linked list have a cycle? " + cycleChecker.hasCycle(cycleList));
    }
}
