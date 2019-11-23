package org.jessenpan.leetcode.dp;

/**
 * @author jessenpan
 * tag:dynamicProgramming
 */
public class S392IsSubsequence {

    public boolean isSubsequence(String s, String t) {

        if (s == null || s.isEmpty()) {
            return true;
        }

        if (t == null || t.isEmpty()) {
            return false;
        }

        char c = s.charAt(0);
        int i, len = t.length();
        boolean found = false;
        for (i = 0; i < len; i++) {
            if (t.charAt(i) == c) {
                found = true;
                break;
            }
        }
        if (s.length() == 1 && found) {
            return true;
        }
        if (!found) {
            return false;
        }
        return isSubsequence(s.substring(1), i + 1 == len ? "" : t.substring(i + 1));
    }

}
