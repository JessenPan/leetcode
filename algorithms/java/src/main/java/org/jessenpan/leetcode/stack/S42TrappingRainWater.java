package org.jessenpan.leetcode.stack;

/**
 * @author jessenpan
 * tag:stack
 */
public class S42TrappingRainWater {

    //TODO study
    public int trap(int[] height) {
        int n = height.length;
        int[] left = new int[n];
        int[] right = new int[n];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], height[i - 1]);
        }
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], height[i + 1]);
        }
        int water = 0;
        for (int i = 0; i < n; i++) {
            int level = Math.min(left[i], right[i]);
            water += Math.max(0, level - height[i]);
        }
        return water;
    }

}
