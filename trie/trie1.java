public class trie1 {
    static class Node {
        Node[] children = new Node[26];
        boolean eow;

        public Node() {
            for (int i = 0; i < 26; i++) {
                children[i] = null;
            }
            eow = false;
        }
    }

    public static Node root = new Node();

    public static void insert(String word) { // O(n)
        Node curr = root;
        for (int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static boolean search(String key) { // O(n)
        Node curr = root;
        for (int level = 0; level < key.length(); level++) {
            int idx = key.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow;
    }

    public static boolean startsWith(String prefix) { // O(n)
        Node curr = root;
        for (int level = 0; level < prefix.length(); level++) {
            int idx = prefix.charAt(level) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    public static boolean wordBreak(String key) {
        int len = key.length();

        if (len == 0) {
            return true;
        }

        for (int i = 1; i <= len; i++) {
            if (search(key.substring(0, i)) && wordBreak(key.substring(i))) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String[] words = {"the", "a", "there", "their", "any", "thee", "hello", "world"};
        for (String word : words) {
            insert(word);
            System.out.println(word);
        }

        System.out.println( search("thee"));
        System.out.println( search("thor"));
        System.out.println(startsWith("the"));
        System.out.println(startsWith("thi"));

        // Word Break Test
        System.out.println(wordBreak("thea")); // Expected: true
        System.out.println(wordBreak("theeany")); // Expected: true
        System.out.println( wordBreak("helloany")); // Expected: true
        System.out.println(wordBreak("hello")); // Expected: false
    }
}
