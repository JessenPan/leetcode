package org.jessenpan.leetcode.string;

/**
 * @author jessenpan
 * tag:string
 */
public class S583DeleteOperationForTwoStrings {

    public int minDistance(String word1, String word2) {
        int[] charArray1 = convert(word1);
        int[] charArray2 = convert(word2);
        int distance = 0;
        for (int i = 0; i < 26; i++) {
            distance += Math.abs(charArray1[i] - charArray2[i]);
        }
        return distance;
    }

    private int[] convert(String word) {
        int len = word.length();
        int[] array = new int[26];
        for (int i = 0; i < len; i++) {
            array[word.charAt(i) - 'a']++;
        }
        return array;
    }

}
