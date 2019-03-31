package org.jessenpan.leetcode.string;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author jessenpan
 * tag:string
 */
public class S14LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        int minLength = Arrays.stream(strs).min(Comparator.comparingInt(String::length)).get().length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < minLength; i++) {
            char commonChar = strs[0].charAt(i);
            if (isAllEqual(strs, commonChar, i)) {
                sb.append(commonChar);
            } else {
                break;
            }
        }
        return sb.toString();
    }

    private boolean isAllEqual(String[] strs, char commonChar, int i) {
        int length = strs.length;
        for (int j = 1; j < length; j++) {
            if (strs[j].charAt(i) != commonChar) {
                return false;
            }
        }
        return true;
    }
}
