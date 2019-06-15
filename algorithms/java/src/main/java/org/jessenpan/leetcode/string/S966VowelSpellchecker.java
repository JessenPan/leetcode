package org.jessenpan.leetcode.string;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author jessenpan
 * tag:string
 */
public class S966VowelSpellchecker {

    private Set<String> wordsPerfect=new HashSet<>();
    private Map<String, String> wordsCap=new HashMap<>();
    private Map<String, String> wordsVow = new HashMap<>();

    public String[] spellchecker(String[] wordlist, String[] queries) {

        for (String word : wordlist) {
            wordsPerfect.add(word);

            String wordlow = word.toLowerCase();
            wordsCap.putIfAbsent(wordlow, word);

            String wordlowDV = devowel(wordlow);
            wordsVow.putIfAbsent(wordlowDV, word);
        }

        String[] ans = new String[queries.length];
        int t = 0;
        for (String query : queries) {
            ans[t++] = solve(query);
        }
        return ans;
    }

    public String solve(String query) {
        if (wordsPerfect.contains(query)) {
            return query;
        }

        String queryL = query.toLowerCase();
        if (wordsCap.containsKey(queryL)) {
            return wordsCap.get(queryL);
        }

        String queryLV = devowel(queryL);
        if (wordsVow.containsKey(queryLV)) {
            return wordsVow.get(queryLV);
        }

        return "";
    }

    private String devowel(String word) {
        StringBuilder ans = new StringBuilder();
        for (char c : word.toCharArray()) {
            ans.append(isVowel(c) ? '*' : c);
        }
        return ans.toString();
    }

    private boolean isVowel(char c) {
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }

}
