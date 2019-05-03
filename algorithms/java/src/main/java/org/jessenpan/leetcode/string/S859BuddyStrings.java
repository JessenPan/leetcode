package org.jessenpan.leetcode.string;

import java.util.Arrays;

/**
 * @author jessenpan
 * tag:string
 */
public class S859BuddyStrings {

    public boolean buddyStrings(String a, String b) {
        int lenOfA = a.length(), lenOfB = b.length();
        if (lenOfA != lenOfB) {
            return false;
        }

        int[] arrayOfA = convert2Array(a);
        int[] arrayOfB = convert2Array(b);

        if (a.equals(b)) {
            return hasACharRepeated(arrayOfA);
        }
        if (!Arrays.equals(arrayOfA, arrayOfB)) {
            return false;
        }
        int diffNum = 0;
        for (int i = 0; i < lenOfA; i++) {
            if (a.charAt(i) != b.charAt(i)) {
                diffNum++;
            }
        }
        return diffNum == 2;
    }

    private boolean hasACharRepeated(int[] array) {
        for (int i : array) {
            if (i >= 2) {
                return true;
            }
        }
        return false;
    }

    private int[] convert2Array(String a) {
        int len = a.length();
        int[] array = new int[26];
        for (int i = 0; i < len; i++) {
            array[a.charAt(i) - 'a']++;
        }
        return array;
    }
}
