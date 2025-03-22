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
            slow = slow.next;
            fast = fast.next.next;  

            if (fast == slow) {     
                return true;
            }
        }
        return false;
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

        ListNode cycleList = createCycleList();

        System.out.println("Does the linked list have a cycle? " + cycleChecker.hasCycle(cycleList));
    }
}
