package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:array
 */
public class S1160FindWordsThatCanBeFormedByCharacters {

    public int countCharacters(String[] words, String chars) {
        int[] charArr = toArray(chars);
        int c = 0;
        for (String word : words) {
            int[] wordArr = toArray(word);
            if (isBeInclude(wordArr, charArr)) {
                c += word.length();
            }
        }
        return c;
    }

    private boolean isBeInclude(int[] beIncluded, int[] including) {
        for (int i = 0; i < 26; i++) {
            if (beIncluded[i] > including[i]) {
                return false;
            }
        }
        return true;
    }

    private int[] toArray(String str) {
        int[] charArr = new int[26];
        int len = str.length();
        for (int i = 0; i < len; i++) {
            charArr[str.charAt(i) - 'a']++;
        }
        return charArr;
    }

}
