package org.jessenpan.leetcode.string;

/**
 * @author jessenpan
 * tag:string
 */
public class S647PalindromicSubstrings {

    public int countSubstrings(String s) {

        int sum = 0;

        if (isPalindrome(s)) {
            sum++;
        }
        if (s.length() == 1) {
            return sum;
        }
        int len = s.length();
        for (int i = 1; i < len; i++) {
            if (isPalindrome(s.substring(i, len))) {
                sum++;
            }
        }
        for (int i = len - 1; i >= 1; i--) {
            if (isPalindrome(s.substring(0, i))) {
                sum++;
            }
        }
        return len < 3 ? sum : sum + countSubstrings(s.substring(1, len - 1));
    }

    private boolean isPalindrome(String str) {
        int start = 0, end = str.length() - 1;
        while (start <= end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
