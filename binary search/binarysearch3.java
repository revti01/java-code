public class binarysearch3 {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
        }
    }

    public static Node insert(Node root, int val){
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if(root.data > val){
            // left subtree
            root.left = insert(root.left, val);
        }
        else {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public static void inorder(Node root) {
        if (root == null) {
            return;
        }
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void printInRange(Node root, int X, int Y) {
        if (root == null) {
            return;
        }
        
        if (X < root.data) {
            printInRange(root.left, X, Y);
        }
        
        if (X <= root.data && root.data <= Y) {
            System.out.print(root.data + " ");
        }
        
        if (Y > root.data) {
            printInRange(root.right, X, Y);
        }
    }

    public static void main(String[] args) {
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};
        Node root  = null;

        for (int i = 0; i < values.length; i++){
            root = insert(root, values[i]);
        }

        System.out.println();
        inorder(root);
        
        int X = 3, Y = 10;
        System.out.println();
        printInRange(root, X, Y);
    }
}
