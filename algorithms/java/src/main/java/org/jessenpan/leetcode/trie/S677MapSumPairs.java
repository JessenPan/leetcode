package org.jessenpan.leetcode.trie;

/**
 * @author jessenpan
 * tag:trie
 */
public class S677MapSumPairs {

    static class MapSum {

        static class Node {

            private int val = 0;

            private Node[] children = new Node[26];
        }

        private Node root = new Node();

        public MapSum() {
        }

        public void insert(String key, int val) {
            Node p = root;
            int len = key.length();
            for (int i = 0; i < len; i++) {
                char c = key.charAt(i);
                if (p.children[c - 'a'] == null) {
                    p.children[c - 'a'] = new Node();
                }
                p = p.children[c - 'a'];
            }
            p.val = val;
        }

        public int sum(String prefix) {

            Node p = root;
            int len = prefix.length();
            for (int i = 0; i < len; i++) {
                char c = prefix.charAt(i);
                if (p == null || p.children[c - 'a'] == null) {
                    return 0;
                }
                p = p.children[c - 'a'];
            }
            return sum(p);
        }

        private int sum(Node p) {
            if (p == null) {
                return 0;
            }
            int sum = p.val;
            for (int i = 0; i < 26; i++) {
                sum += sum(p.children[i]);
            }
            return sum;
        }
    }
}
