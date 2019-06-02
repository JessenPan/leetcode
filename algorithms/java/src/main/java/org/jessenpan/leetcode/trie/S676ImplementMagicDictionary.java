package org.jessenpan.leetcode.trie;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jessenpan
 * tag:trie
 */
public class S676ImplementMagicDictionary {

    static class MagicDictionary {

        static class Node {

            boolean isEnd;
            String str;
            Node[] children = new Node[26];
        }

        private Node root = new Node();

        private Map<String, Boolean> record = new HashMap<>();

        public MagicDictionary() {
        }

        public void buildDict(String[] dicts) {
            for (String dict : dicts) {
                Node p = root;
                int len = dict.length();
                for (int i = 0; i < len; i++) {
                    if (p.children[dict.charAt(i) - 'a'] == null) {
                        p.children[dict.charAt(i) - 'a'] = new Node();
                    }
                    p = p.children[dict.charAt(i) - 'a'];
                }
                p.isEnd = true;
                p.str = dict;
            }
        }

        public boolean search(String word) {
            if (record.get(word) != null) {
                return record.get(word);
            }
            return search(word, 0, false, root);

        }

        private boolean search(String word, int index, boolean isReplaced, Node p) {
            if (index == word.length()) {
                return isReplaced && p != null && p.isEnd;
            }

            if (p == null) {
                return false;
            }

            for (int i = 0; i < 26; i++) {
                if (p.children[i] == null) {
                    continue;
                }
                if ((char) (i + 'a') == word.charAt(index)) {
                    if (search(word, index + 1, isReplaced, p.children[i])) {
                        return true;
                    }
                } else if (!isReplaced) {
                    if (search(word, index + 1, true, p.children[i])) {
                        return true;
                    }
                }
            }
            return false;
        }

    }

}
