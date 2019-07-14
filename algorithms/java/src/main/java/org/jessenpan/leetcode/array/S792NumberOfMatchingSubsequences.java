package org.jessenpan.leetcode.array;

import java.util.HashMap;
import java.util.Map;

/**
 * @author jessenpan
 * tag:array
 */
public class S792NumberOfMatchingSubsequences {

    //TODO 
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
            int index = isSubsequence(S, s);
            if (index == 1) {
                sum += map.get(s);
            }
        }
        return sum;
    }

    public int isSubsequence(String s, String t) {

        int i = 0;
        int j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j))
                j++;
            i++;
        }

        if (j == t.length()) {
            return 1;
        } else {
            return 0;
        }
    }

}
