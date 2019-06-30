package org.jessenpan.leetcode.array;

import java.util.Arrays;

/**
 * @author jessenpan
 * tag:array
 */
public class S1051HeightChecker {

    public int heightChecker(int[] heights) {
        int len = heights.length;
        int[] newHeights = Arrays.copyOf(heights, len);
        Arrays.sort(newHeights);
        int diff = 0;
        for (int i = 0; i < len; i++) {
            if (heights[i] != newHeights[i]) {
                diff++;
            }
        }
        return diff;
    }

}
