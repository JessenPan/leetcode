package org.jessenpan.leetcode.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jessenpan
 * tag:hashmap
 */
public class S290WordPattern {

    public boolean wordPattern(String pattern, String str) {

        Map<Character, String> record = new HashMap<>();
        Map<String, Character> reversedRecord = new HashMap<>();
        int lenOfPattern = pattern.length(), lenOfStr = str.length();
        int wordStart = 0, wordEnd = 0;
        String word;
        for (int i = 0; i < lenOfPattern; i++) {

            while (wordEnd < lenOfStr) {
                if (str.charAt(wordEnd) == ' ') {
                    break;
                }
                wordEnd++;
            }
            if (wordEnd == lenOfStr) {
                word = str.substring(wordStart, wordEnd);
            } else {
                word = str.substring(wordStart, wordEnd);
                wordStart = ++wordEnd;
            }

            if ("".equals(word)) {
                return false;
            }

            if (record.get(pattern.charAt(i)) == null && reversedRecord.get(word) == null) {
                record.put(pattern.charAt(i), word);
                reversedRecord.put(word, pattern.charAt(i));
            } else {
                if (record.get(pattern.charAt(i)) != null && !record.get(pattern.charAt(i)).equals(word)) {
                    return false;
                }

                if (reversedRecord.get(word) != null && reversedRecord.get(word) != pattern.charAt(i)) {
                    return false;
                }
            }
            word = "";
        }

        return wordEnd == lenOfStr;
    }

}
