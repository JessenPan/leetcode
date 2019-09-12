package org.jessenpan.leetcode.dynamicProgramming;

/**
 * @author jessenpan
 * tag:dynamicprogramming
 */
public class S516LongestPalindromicSubsequence {

    public int longestPalindromeSubseq(String s) {
        int start = 0, end = s.length() - 1;
        while (true) {
            if (start == end) {
                return 1;
            }
            if (isPalindrome(s, start, end)) {
                return end - start + 1;
            }
            if (isPalindrome(s, start + 1, end)) {
                return end - start;
            }

            if (isPalindrome(s, start, end - 1)) {
                return end - start;
            }
            ++start;
            --end;
        }
    }

    private boolean isPalindrome(String str, int start, int end) {
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
