package org.jessenpan.leetcode.trie;

/**
 * @author jessenpan
 * tag:trie
 */
public class S208ImplementTrie {

    static class Trie {

        static class Node {

            private boolean isEnd;

            private Node[] children = new Node[26];
        }

        private Node root = new Node();

        public Trie() {
        }

        public void insert(String word) {
            Node p = root;
            int len = word.length();
            for (int i = 0; i < len; i++) {
                char c = word.charAt(i);
                if (p.children[c - 'a'] == null) {
                    p.children[c - 'a'] = new Node();
                }
                p = p.children[c - 'a'];
            }
            p.isEnd = true;
        }

        public boolean search(String word) {
            return search(root, word, 0);
        }

        private boolean search(Node p, String word, int index) {
            if (index >= word.length()) {
                return p.isEnd;
            }

            char c = word.charAt(index);
            if (p.children[c - 'a'] == null) {
                return false;
            } else {
                return search(p.children[c - 'a'], word, index + 1);
            }
        }

        public boolean startsWith(String prefix) {
            return startsWith(root,prefix,0);
        }

        private boolean startsWith(Node p, String prefix, int index) {
            if(index>=prefix.length()){
                return true;
            }
            char c = prefix.charAt(index);
            if (p.children[c - 'a'] == null) {
                return false;
            } else {
                return startsWith(p.children[c - 'a'], prefix, index + 1);
            }
        }
    }
}
