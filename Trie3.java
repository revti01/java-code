class Trie3 {
    private static class Node {
        Node[] children;
        boolean isEndOfWord;

        public Node() {
            children = new Node[26]; // Assuming only lowercase English letters
            isEndOfWord = false;
        }
    }

    private Node root;
    private String longestWord;

    public Trie3() {
        root = new Node();
        longestWord = "";
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

    private void findLongestWord(Node root, StringBuilder curr) {
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null && root.children[i].isEndOfWord) {
                curr.append((char) (i + 'a'));
                if (curr.length() > longestWord.length()) {
                    longestWord = curr.toString();
                }
                findLongestWord(root.children[i], curr);
                curr.deleteCharAt(curr.length() - 1);
            }
        }
    }

    public String getLongestWord() {
        longestWord = "";
        findLongestWord(root, new StringBuilder());
        return longestWord;
    }

    public static void main(String[] args) {
        Trie3 trie = new Trie3();
        trie.insert("apple");
        trie.insert("apply");
        trie.insert("applicable");
        trie.insert("applause");
        System.out.println("Longest word: " + trie.getLongestWord()); // Output: applicable
    }
}
