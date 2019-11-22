package org.jessenpan.leetcode.backtracking;

import java.util.HashSet;
import java.util.Set;

/**
 * @author jessenpan
 * tag:backtracking
 */
public class S1079LetterTilePossibilities {

    private Set<String> record = new HashSet<>();

    private int len;

    public int numTilePossibilities(String tiles) {
        char[] arrays = tiles.toCharArray();
        len = arrays.length;
        countPossibilities("", arrays);
        return record.size();
    }

    private void countPossibilities(String subStr, char[] left) {
        if (subStr.length() == len) {
            record.add(subStr);
            return;
        }

        if (!subStr.isEmpty()) {
            record.add(subStr);
        }
        for (int i = 0; i < len; i++) {
            if (left[i] >= 'A' && left[i] <= 'Z') {
                char orign = left[i];
                left[i] = '1';
                countPossibilities(subStr + orign, left);
                left[i] = orign;
            }
        }
    }

}
