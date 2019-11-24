package org.jessenpan.leetcode.map;

/**
 * @author jessenpan
 * tag:hashmap
 */
public class S409LongestPalindrome {

    public int longestPalindrome(String s) {
        int[] map = new int[52];
        int length = s.length();
        for (int i = 0; i < length; i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                map[s.charAt(i) - 'a']++;
            }
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                map[s.charAt(i) - 'A' + 26]++;
            }
        }
        boolean hasCountOne = false;
        int longestLength = 0;
        for (int times : map) {
            if (times == 1 && !hasCountOne) {
                longestLength++;
                hasCountOne = true;
            } else if ((times & 1) == 0) {
                longestLength += times;
            } else if (times > 1) {
                if (!hasCountOne) {
                    longestLength += times;
                    hasCountOne = true;
                } else {
                    longestLength += times - 1;
                }
            }
        }
        return longestLength;
    }

}
