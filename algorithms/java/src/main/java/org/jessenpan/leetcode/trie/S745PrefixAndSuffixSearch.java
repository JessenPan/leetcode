package org.jessenpan.leetcode.trie;

/**
 * @author jessenpan
 * tag:trie
 */
public class S745PrefixAndSuffixSearch {

    public static class WordFilter {

        static class Node {

            boolean isEnd = false;
            String str;
            int weight;
            Node[] children = new Node[26];
        }

        private Node root = new Node();

        public WordFilter(String[] words) {
            int lenOfWords = words.length;
            for (int j = 0; j < lenOfWords; j++) {
                String word = words[j];
                Node p = root;
                int len = word.length();
                for (int i = 0; i < len; i++) {
                    if (p.children[word.charAt(i) - 'a'] == null) {
                        p.children[word.charAt(i) - 'a'] = new Node();
                    }
                    p = p.children[word.charAt(i) - 'a'];
                }
                p.isEnd = true;
                p.str = word;
                p.weight = j;
            }
        }

        public int f(String prefix, String suffix) {
            Node p = root;
            int len = prefix.length();
            for (int i = 0; i < len; i++) {
                if (p.children[prefix.charAt(i) - 'a'] != null) {
                    p = p.children[prefix.charAt(i) - 'a'];
                } else {
                    return -1;
                }
            }

            return findMaxWeight(suffix, p);
        }

        private int findMaxWeight(String suffix, Node p) {
            int weight = -1;
            if (p.isEnd && p.str.endsWith(suffix)) {
                weight = p.weight;
            }
            for (int i = 0; i < 26; i++) {
                if (p.children[i] != null) {
                    weight = Math.max(weight, findMaxWeight(suffix, p.children[i]));
                }
            }
            return weight;
        }
    }

}
