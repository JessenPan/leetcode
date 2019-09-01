package org.jessenpan.leetcode.array;

import java.util.Arrays;

/**
 * @author jessenpan
 * tag:array
 */
public class S1170CompareStringsByFrequencyOfTheSmallestCharacter {

    public int[] numSmallerByFrequency(String[] queries, String[] words) {
        int[] result = new int[queries.length];

        int[] wordLens = new int[words.length];
        int len = words.length;
        for (int i = 0; i < len; i++) {
            wordLens[i] = countMinCode(words[i]);
        }
        Arrays.sort(wordLens);

        for (int i = 0; i < queries.length; i++) {
            int countMinQuery = countMinCode(queries[i]);
            if (countMinQuery > wordLens[len - 1]) {
                result[i] = 0;
            } else {
                for (int wordLen : wordLens) {
                    
                    if (countMinQuery < wordLen) {
                        result[i]++;
                    }
                }
            }
        }
        return result;
    }

    private int countMinCode(String s) {
        char min = s.charAt(0);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) < min) {
                min = s.charAt(i);
                count = 0;
            }
            if (s.charAt(i) == min) {
                count++;
            }
        }
        return count;
    }

}
