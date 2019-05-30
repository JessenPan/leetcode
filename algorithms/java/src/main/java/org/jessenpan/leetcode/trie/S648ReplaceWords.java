package org.jessenpan.leetcode.trie;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author jessenpan
 * tag:trie
 */
public class S648ReplaceWords {

    static class Node {

        boolean isEnd;
        Node[] children = new Node[26];
        String str;
    }

    private Node root = new Node();

    public String replaceWords(List<String> dicts, String sentence) {

        Node p;
        for (String dict : dicts) {
            p = root;
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

        Map<String, String> record = new HashMap<>();

        StringBuilder newSentence = new StringBuilder();
        String[] words = sentence.split(" ");
        int wordsLen = words.length;
        for (int i = 0; i < wordsLen; i++) {

            if (record.get(words[i]) != null) {
                newSentence.append(record.get(words[i]));
            } else {
                boolean isPut = false;
                p = root;
                int len = words[i].length();
                for (int j = 0; j < len; j++) {
                    if (p.children[words[i].charAt(j) - 'a'] == null) {
                        newSentence.append(words[i]);
                        record.put(words[i], words[i]);
                        isPut = true;
                        break;
                    } else if (p.children[words[i].charAt(j) - 'a'].isEnd) {
                        newSentence.append(p.children[words[i].charAt(j) - 'a'].str);
                        record.put(words[i], p.children[words[i].charAt(j) - 'a'].str);
                        isPut = true;
                        break;
                    } else {
                        p = p.children[words[i].charAt(j) - 'a'];
                    }
                }
                if (!isPut) {
                    newSentence.append(words[i]);
                    record.put(words[i], words[i]);
                }
            }
            if (i != (wordsLen - 1)) {
                newSentence.append(" ");
            }
        }
        return newSentence.toString();
    }

}
