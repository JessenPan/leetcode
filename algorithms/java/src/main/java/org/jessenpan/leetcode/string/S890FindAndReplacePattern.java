package org.jessenpan.leetcode.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author jessenpan
 * tag:string
 */
public class S890FindAndReplacePattern {

    public List<String> findAndReplacePattern(String[] words, String pattern) {

        List<String> matches = new ArrayList<>();

        for (String word : words) {
            Map<Character, Character> record = new HashMap<>();
            Map<Character, Character> reversedRecord = new HashMap<>();
            int len = word.length();
            boolean match = true;
            for (int i = 0; i < len; i++) {
                char p = pattern.charAt(i);
                char w = word.charAt(i);
                if (record.get(p) == null && reversedRecord.get(w) == null) {
                    record.put(p, w);
                    reversedRecord.put(w, p);
                } else {
                    if (record.get(p) != null && record.get(p) != w) {
                        match = false;
                        break;
                    }
                    if (reversedRecord.get(w) != null && reversedRecord.get(w) != p) {
                        match = false;
                        break;
                    }
                }
            }
            if (match) {
                matches.add(word);
            }
        }
        return matches;
    }

}
