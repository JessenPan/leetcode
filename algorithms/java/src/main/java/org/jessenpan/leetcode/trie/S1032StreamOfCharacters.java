package org.jessenpan.leetcode.trie;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jessenpan
 * tag:trie
 */
public class S1032StreamOfCharacters {

    public static class StreamChecker {

        static class Node {

            boolean isEnd = false;
            String str;
            Node[] children = new Node[26];
        }

        Node root = new Node();
        List<Character> chars = new ArrayList<>();

        public StreamChecker(String[] words) {
            int len = words.length;
            for (int i = 0; i < len; i++) {
                Node p = root;
                String word = words[i];
                int lenOfWord = word.length();
                for (int j = lenOfWord - 1; j >= 0; j--) {
                    if (p.children[word.charAt(j) - 'a'] == null) {
                        p.children[word.charAt(j) - 'a'] = new Node();
                    }
                    p = p.children[word.charAt(j) - 'a'];
                }
                p.isEnd = true;
                p.str = word;
            }
        }

        public boolean query(char letter) {
            chars.add(letter);
            return canSpellSomeWord(chars.size() - 1, root);
        }

        private boolean canSpellSomeWord(int index, Node p) {
            if (index < 0) {
                return false;
            }
            if (p.children[chars.get(index) - 'a'] == null) {
                return false;
            }
            if (p.children[chars.get(index) - 'a'].isEnd) {
                return true;
            }
            return canSpellSomeWord(index - 1, p.children[chars.get(index) - 'a']);
        }
    }

}
