package org.jessenpan.leetcode.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author jessenpan
 * tag:string
 */
public class S395LongestSubstringWithAtLeastKRepeatingCharacters {

    private int cnt = 0;


    public int longestSubstring(String s, int k) {

        calc(s, k);
        return cnt;
    }

    private void calc(String s, int k) {
        Integer[] map = new Integer[26];
        int len = s.length();
        for (int i = 0; i < len; i++) {
            int idx = s.charAt(i) - 'a';
            if (map[idx] == null) {
                map[idx] = 1;
            } else {
                map[idx]++;
            }
        }

        Set<Character> splitedChars = new HashSet<>();
        for (int i = 0; i < 26; i++) {
            if (map[i] != null && map[i] < k) {
                splitedChars.add((char) (i + 'a'));
            }
        }
        if (splitedChars.isEmpty()) {
            cnt = Math.max(cnt, s.length());
            return;
        }

        List<String> list = new ArrayList<>();
        int left = 0, right = 0;
        String sub;
        while (right < len) {
            if (splitedChars.contains(s.charAt(right))) {
                sub = s.substring(left, right);
                if (!sub.isEmpty()) {
                    list.add(sub);
                }
                right++;
                left = right;
                continue;
            } else if (right == len - 1) {
                sub = s.substring(left, right + 1);
                if (!sub.isEmpty()) {
                    list.add(sub);
                }
                right++;
                continue;
            }
            right++;
        }
        for (String str : list) {
            calc(str, k);
        }
    }

}
