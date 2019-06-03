package org.jessenpan.leetcode.trie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author jessenpan
 * tag:trie
 */
public class S472ConcatenatedWords {

    static class Node {

        boolean isWord = false;
        Map<Character, Node> children = new HashMap<>(); //使用map可以所处理的字符种类是动态变化的情况。
    }

    private Node root = new Node();

    public void add(String word) {
        Node cur = root;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            if (cur.children.get(c) == null) {
                cur.children.put(c, new Node());
            }
            cur = cur.children.get(c);
        }
        cur.isWord = true;
    }

    public List<String> findAllConcatenatedWordsInADict(String[] words) {
        for (String word : words) {
            this.add(word);
        }
        List<String> result = new ArrayList<>();
        for (String word : words) {
            if (isFind(this.root, word, 0, 0)) {
                result.add(word);
            }
        }
        return result;
    }

    private boolean isFind(Node root, String word, int index, int count) {
        if (index == word.length()) {
            return count > 1;
        }
        Node cur = root;
        for (int i = index; i < word.length(); i++) {
            char c = word.charAt(i);
            if (cur.children.get(c) == null) {
                return false;
            }
            if (cur.children.get(c).isWord && isFind(root, word, i + 1, count + 1)) {
                return true;
            }
            cur = cur.children.get(c);
        }
        return false;
    }
}
