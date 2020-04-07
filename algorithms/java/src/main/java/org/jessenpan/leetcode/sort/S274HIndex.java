package org.jessenpan.leetcode.sort;

import java.util.Arrays;

/**
 * @author jessenpan
 * tag:sort
 */
public class S274HIndex {

    public int hIndex(int[] citations) {

        if (citations.length == 0) {
            return 0;
        }
        Arrays.sort(citations);
        int h = 0, cur = 1;
        for (int i = citations.length - 1; i >= 0; i--) {
            if (citations[i] >= cur) {
                h = cur;
                cur++;
                continue;
            }
            break;
        }
        return h;
    }

}
