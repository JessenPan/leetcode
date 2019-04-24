package org.jessenpan.leetcode.hashmap;

/**
 * @author jessenpan
 * tag:hashmap
 */
public class S242ValidAnagram {

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int lengthOfStr = s.length();
        int[] arrayOfS = new int[26], arrayOfT = new int[26];
        for (int i = 0; i < lengthOfStr; i++) {
            arrayOfS[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < lengthOfStr; i++) {
            arrayOfT[t.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (arrayOfS[i] != arrayOfT[i]) {
                return false;
            }
        }
        return true;
    }
}
