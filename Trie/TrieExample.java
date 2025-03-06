package Trie;

import java.util.ArrayList;
import java.util.List;

class Node {
    Node[] children;
    boolean endOfWord;
    int prefixCount; // Tracks number of words passing through this node

    Node() {
        children = new Node[26]; // For lowercase English letters
        endOfWord = false;
        prefixCount = 0;
    }
}

class Trie {
    Node root;

    Trie() {
        root = new Node();
    }

    // Insert words into Trie
    void insert(String word) {
        Node curr = this.root;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';

            if (curr.children[index] == null) {
                curr.children[index] = new Node();
            }
            curr = curr.children[index];
            curr.prefixCount++; // Increase prefix count
        }
        curr.endOfWord = true;
    }

    // Search for a word
    boolean searchWords(String word) {
        Node curr = this.root;
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i) - 'a';

            if (curr.children[index] == null) {
                return false;
            }
            curr = curr.children[index];
        }
        return curr.endOfWord;
    }

    // Function to find words with a given prefix
    List<String> getWordsWithPrefix(String prefix) {
        List<String> words = new ArrayList<>();
        Node curr = this.root;

        // Step 1: Navigate to the end of the prefix
        for (int i = 0; i < prefix.length(); i++) {
            int index = prefix.charAt(i) - 'a';
            if (curr.children[index] == null) {
                return words; // Prefix not found, return empty list
            }
            curr = curr.children[index];
        }

        // Step 2: Reuse the existing function to collect words
        printAllWordsInTrie(curr, prefix, words);

        return words;
    }

    // **Existing function: Collect words using DFS**
    void printAllWordsInTrie(Node node, String prefix, List<String> words) {
        if (node.endOfWord) {
            words.add(prefix); // Add word if it's complete
        }

        for (char ch = 'a'; ch <= 'z'; ch++) {
            int index = ch - 'a';
            if (node.children[index] != null) {
                printAllWordsInTrie(node.children[index], prefix + ch, words);
            }
        }
    }
}

public class TrieExample {
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("apple");
        trie.insert("app");
        trie.insert("application");
        trie.insert("apply");
        trie.insert("bat");
        trie.insert("banana");

        System.out.println("Words with prefix 'app': " + trie.getWordsWithPrefix("app"));
        System.out.println("Words with prefix 'bat': " + trie.getWordsWithPrefix("bat"));
        System.out.println("Words with prefix 'b': " + trie.getWordsWithPrefix("b"));
        System.out.println("Words with prefix 'cat': " + trie.getWordsWithPrefix("cat"));
    }
}
