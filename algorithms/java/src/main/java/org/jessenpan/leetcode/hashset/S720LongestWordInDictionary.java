package org.jessenpan.leetcode.hashset;

import java.util.*;

/**
 * @author jessenpan
 * tag:hashset
 */
public class S720LongestWordInDictionary {

    public String longestWord(String[] words) {
        Arrays.sort(words);
        Set<String> record = new HashSet<>();
        String longestWord = "";
        for (String word : words) {
            if (word.length() == 1 || record.contains(word.substring(0, word.length() - 1))) {
                longestWord = word.length() > longestWord.length() ? word : longestWord;
                record.add(word);
            }
        }
        return longestWord;
    }

}
