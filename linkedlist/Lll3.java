public class Lll3 {
    private Node head;
    private int size;

    // Node class
    private static class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public Lll3() {
        this.head = null;
        this.size = 0;
    }

    public void addInMiddle(int index, String data) {
        if (index > size || index < 0) {
            System.out.println("Invalid Index value");
            return;
        }

        Node newNode = new Node(data);
        if (index == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node currNode = head;
            for (int i = 0; i < index - 1; i++) {
                currNode = currNode.next;
            }
            newNode.next = currNode.next;
            currNode.next = newNode;
        }
        size++; // Increase size only after successful insertion
    }

    // Method to print the linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        Lll3 list = new Lll3();
        list.addInMiddle(0, "A");
        list.addInMiddle(1, "B");
        list.addInMiddle(1, "C");
        list.addInMiddle(2, "D");

        list.printList(); // Expected output: A -> C -> D -> B -> null
    }
}
