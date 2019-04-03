package org.jessenpan.leetcode.array;

import java.util.LinkedList;
import java.util.List;

/**
 * @author jessenpan
 * tag:array
 */
public class S1002FindCommonCharacters {

    public List<String> commonChars(String[] a) {
        List<String> list = new LinkedList<>();
        int lengthOfArray = a.length;
        int[][] map = new int[lengthOfArray][26];
        for (int i = 0; i < lengthOfArray; i++) {
            int length = a[i].length();
            for (int j = 0; j < length; j++) {
                map[i][a[i].charAt(j) - 'a']++;
            }
        }

        int minLength;
        for (int i = 0; i < 26; i++) {
            minLength = -1;
            for (int j = 0; j < lengthOfArray; j++) {
                if (minLength == -1) {
                    minLength = map[j][i];
                    continue;
                }
                if (map[j][i] < minLength) {
                    minLength = map[j][i];
                }
            }
            if (minLength > 0) {
                for (int j = 0; j < minLength; j++) {
                    list.add(String.valueOf((char) (i + 'a')));
                }
            }
        }
        return list;
    }
}
