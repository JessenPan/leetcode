package org.jessenpan.leetcode.backtracking;

import java.util.ArrayList;
import java.util.List;

/**
 * @author jessenpan
 * tag:backtracings
 */
public class S131PalindromePartitioning {

    private List<List<String>> palindromes = new ArrayList<>();

    public List<List<String>> partition(String s) {
        findPalindromes(s, new ArrayList<>(), 0);
        return palindromes;
    }

    private void findPalindromes(String s, List<String> subPalindromes, int position) {
        if (position == s.length()) {
            palindromes.add(subPalindromes);
            return;
        }
        int i = 1;
        while (position + i <= s.length()) {
            if (isPalindrome(s, position, position + i - 1)) {
                String palindrome = s.substring(position, position + i);
                List<String> newSub = new ArrayList<>(subPalindromes);
                newSub.add(palindrome);
                findPalindromes(s, newSub, position + i);
            }
            i++;
        }
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
