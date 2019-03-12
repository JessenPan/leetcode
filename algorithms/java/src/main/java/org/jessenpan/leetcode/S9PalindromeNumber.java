package org.jessenpan.leetcode;

/**
 * @author jessenpan
 */
public class S9PalindromeNumber {

    public boolean isPalindrome(int x) {
        String intOfString = Integer.toString(x);
        return isPalindromeOfString(intOfString);
    }

    public boolean isPalindromeOfString(String s) {
        if (s.length() == 1 || s.length() == 0) {
            return true;
        }

        int loopLength = s.length() / 2;
        int lengthOfString = s.length();
        for (int i = 0; i < loopLength; i++) {
            if (s.charAt(i) != s.charAt(lengthOfString - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
