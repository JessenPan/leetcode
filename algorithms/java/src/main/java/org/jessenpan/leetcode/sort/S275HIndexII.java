package org.jessenpan.leetcode.sort;

/**
 * @author jessenpan
 */
public class S275HIndexII {

    public int hIndex(int[] citations) {
        if (citations.length == 0) {
            return 0;
        }

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
