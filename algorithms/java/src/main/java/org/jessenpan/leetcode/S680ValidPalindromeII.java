package org.jessenpan.leetcode;

/**
 * @author jessenpan
 * tag:string
 */
public class S680ValidPalindromeII {

    public boolean validPalindrome(String s) {
        if (s.isEmpty()) {
            return true;
        }
        int startIndex = 0, endIndex = s.length() - 1;
        while (startIndex < endIndex) {
            if (s.charAt(startIndex) == s.charAt(endIndex)) {
                startIndex++;
                endIndex--;
                continue;
            }
            if (isValidPalindrome(startIndex + 1, endIndex, s)) {
                return true;
            }
            return isValidPalindrome(startIndex, endIndex - 1, s);
        }
        return true;
    }

    private boolean isValidPalindrome(int startIndex, int endIndex, String s) {
        while (startIndex < endIndex) {
            if (s.charAt(startIndex) == s.charAt(endIndex)) {
                startIndex++;
                endIndex--;
            } else {
                return false;
            }
        }
        return true;
    }

}
