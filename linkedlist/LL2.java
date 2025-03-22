public class LL1{
    Node head;

    class node {
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    public void removeFirst() {
        if(head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }
 
 
        head = this.head.next;
        size--;
    }
 
 
    public void removeLast() {
        if(head == null) {
            System.out.println("Empty List, nothing to delete");
            return;
        }
 
 
        size--;
        if(head.next == null) {
            head = null;
            return;
        }
 
 
        Node currNode = head;
        Node lastNode = head.next;
        while(lastNode.next != null) {
            currNode = currNode.next;
            lastNode = lastNode.next;
        }
 
 
        currNode.next = null;
    }
 
    public static void main(String[] args) {
        LL list = new LL();
        list.addfirst("a");
        list.addfirst("is");
        list.printlist();

    }
}