package org.jessenpan.leetcode.trie;

import java.util.*;

/**
 * @author jessenpan
 * tag:trie
 */
public class S336PalindromePairs {

    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> ans = new ArrayList<>();
        Map<String, Integer> dict = new HashMap<>();
        int len = words.length;
        for (int i = 0; i < len; i++) {
            dict.put(words[i], i);
        }
        for (int i = 0; i < len; i++) {
            String word = words[i];
            int lenOfWord = word.length();
            for (int j = 0; j <= lenOfWord; j++) {
                // 找后缀
                if (isPalindrome(word, j, lenOfWord - 1)) {
                    // 后缀可以为空
                    String suffix = new StringBuilder(word.substring(0, j)).reverse().toString();
                    if (dict.get(suffix) != null && i != dict.get(suffix)) {
                        ans.add(Arrays.asList(i, dict.get(suffix)));
                    }
                }
                // 找前缀
                if (j > 0 && isPalindrome(word, 0, j - 1)) {
                    String prefix = new StringBuilder(word.substring(j)).reverse().toString();
                    if (dict.get(prefix) != null && i != dict.get(prefix)) {
                        ans.add(Arrays.asList(dict.get(prefix), i));
                    }
                }
            }
        }
        return ans;
    }

    private boolean isPalindrome(String s, int startIndex, int endIndex) {
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
