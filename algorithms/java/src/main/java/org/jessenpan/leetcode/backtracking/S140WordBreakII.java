package org.jessenpan.leetcode.backtracking;

import java.util.*;

/**
 * @author jessenpan
 * tag:backtracing
 */
public class S140WordBreakII {

    private List<String> sentences = new ArrayList<>();

    private Set<String> wordDictSet = new HashSet<>();

    public List<String> wordBreak(String s, List<String> wordDict) {
        if (!canBeWordBreak(s, wordDict)) {
            return Collections.emptyList();
        }
        wordDictSet.addAll(wordDict);
        findWord(new ArrayList<>(), s);
        return sentences;
    }

    public boolean canBeWordBreak(String s, List<String> wordDict) {
        int maxWordLength = 0;//字典中单词最长长度
        for (String word : wordDict) {
            maxWordLength = Math.max(maxWordLength, word.length());
        }
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i < s.length() + 1; i++) {
            int x = i - maxWordLength > 0 ? i - maxWordLength : 0;
            for (int j = x; j < i; j++) {
                if (dp[j] && wordDict.contains(s.substring(j, i))) {//s存在以第j位为末尾的单词并且截取第j到i位的单词存在于字典中
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }

    private void findWord(List<String> subSentences, String leavedStr) {
        if ("".equals(leavedStr)) {
            sentences.add(String.join(" ", subSentences));
            return;
        }

        int len = leavedStr.length();
        for (int i = 1; i <= len; i++) {
            String str = leavedStr.substring(0, i);
            if (wordDictSet.contains(str)) {
                List<String> newSubSentences = new ArrayList<>(subSentences);
                newSubSentences.add(str);
                String newLeavedStr = (i == len ? "" : leavedStr.substring(i));
                findWord(newSubSentences, newLeavedStr);
            }
        }
    }

}
