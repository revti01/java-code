import java.util.ArrayList;

public class binarysearch5 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
        }
    }

    public static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }
        if (root.data > val) {
            // left subtree
            root.left = insert(root.left, val);
        } else {
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

    public static void printRootToLeaf(Node root, ArrayList<Integer> path) {
        if (root == null) {
            return;
        }

        // Add current node to the path
        path.add(root.data);

        // leaf
        if (root.left == null && root.right == null) {
            System.out.println(path);
        } else { //non-leaf
            printRootToLeaf(root.left, new ArrayList<>(path));
            printRootToLeaf(root.right, new ArrayList<>(path));
        }
    }

    public static void main(String[] args) {
        int values[] = {5, 1, 3, 4, 2, 7};
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        System.out.println();
        inorder(root);

        System.out.println();
        printRootToLeaf(root, new ArrayList<>());
    }
}
