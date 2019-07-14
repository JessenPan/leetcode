package org.jessenpan.leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jessenpan
 * tag:array
 */
public class S792NumberOfMatchingSubsequences {

    public int numMatchingSubseq(String S, String[] words) {

        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            if (!map.containsKey(words[i])) {
                map.put(words[i], 1);
            } else {
                map.put(words[i], map.get(words[i]) + 1);
            }
        }
        int sum = 0;
        for (String s : map.keySet()) {
            if (isSubsequence(S, s)) {
                sum += map.get(s);
            }
        }
        return sum;
    }

    public boolean isSubsequence(String s, String t) {

        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                j++;
            }
            i++;
        }

        return j == t.length();
    }

}
