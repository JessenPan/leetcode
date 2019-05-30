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
            
            
        }
    }

}
