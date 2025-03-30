class Trie2 {
    private static class Node {
        Node[] children;
        boolean isEndOfWord;

        public Node() {
            children = new Node[26]; // Assuming only lowercase English letters
            isEndOfWord = false;
        }
    }

    private Node root;

    public Trie2() {
        root = new Node();
    }

    public void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.isEndOfWord = true;
    }

    public boolean startsWith(String prefix) {
        Node curr = root;
        for (int i = 0; i < prefix.length(); i++) {
            int idx = prefix.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    public static void main(String[] args) {
        Trie2 trie = new Trie2();
        trie.insert("apple");
        System.out.println(trie.startsWith("app")); // Output: true
        System.out.println(trie.startsWith("apl")); // Output: false
        trie.insert("apply");
        System.out.println(trie.startsWith("app")); // Output: true
    }
}