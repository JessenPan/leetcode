package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:array
 */
public class S11ContainerWithMostWater {

    public int maxArea(int[] heights) {

        int left, leftHeight;
        int max = 0;
        int len = heights.length;
        for (int i = 0; i < len - 1; i++) {
            left = i;
            leftHeight = heights[i];
            for (int j = 0; j < len; j++) {
                max = Math.max(max, (j - left) * Math.min(leftHeight, heights[j]));
            }
        }

        return max;
    }

}
