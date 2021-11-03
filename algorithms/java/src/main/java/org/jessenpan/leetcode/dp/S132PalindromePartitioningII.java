package org.jessenpan.leetcode.dp;

/**
 * @author jessenpan
 * tag:dp
 */
public class S132PalindromePartitioningII {

    Integer[] memo;

    String s;

    public int minCut(String s) {
        if (s.length() <= 1) {
            return 0;
        }
        memo = new Integer[s.length()];
        this.s = s;
        return find(0);
    }

    private int find(int startIdx) {
        if (startIdx >= s.length()) {
            return 0;
        }
        if (memo[startIdx] != null) {
            return memo[startIdx];
        }
        int times = Integer.MAX_VALUE;
        if (isPalindrome(s, startIdx, s.length() - 1)) {
            times = 0;
        } else {
            for (int i = 1; startIdx + i <= s.length(); i++) {
                if (isPalindrome(s, startIdx, startIdx + i - 1)) {
                    times = Math.min(times, 1 + find(startIdx + i));
                }
            }
        }
        memo[startIdx] = times;
        return times;
    }

    private boolean isPalindrome(String str, int left, int right) {
        while (left <= right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
