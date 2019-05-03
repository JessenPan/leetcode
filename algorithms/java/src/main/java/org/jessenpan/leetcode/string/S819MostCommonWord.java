package org.jessenpan.leetcode.string;

import java.util.*;

/**
 * @author jessenpan
 * tag:string
 */
public class S819MostCommonWord {

    public String mostCommonWord(String paragraph, String[] banned) {

        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));
        Set<Character> splitChars = new HashSet<>(Arrays.asList('!', '?', '\'', ',', ';', '.', ' '));
        Map<String, Integer> record = new HashMap<>();
        int maxCnt = 0;
        String mostCommonWord = null;
        int len = paragraph.length(), lastIndex = 0;
        for (int i = 0; i < len; i++) {
            if (splitChars.contains(paragraph.charAt(i)) || i == (len - 1)) {
                String word;
                if (!splitChars.contains(paragraph.charAt(i))) {
                    word = paragraph.substring(lastIndex).toLowerCase();
                } else {
                    word = paragraph.substring(lastIndex, i).toLowerCase();
                }
                lastIndex = i + 1;
                if (bannedSet.contains(word) || "".equals(word.trim())) {
                    continue;
                }
                Integer cnt = record.get(word);
                cnt = cnt == null ? 1 : cnt + 1;
                record.put(word, cnt);
                if (cnt > maxCnt) {
                    maxCnt = cnt;
                    mostCommonWord = word;
                }
            }
        }
        return mostCommonWord;
    }
}
