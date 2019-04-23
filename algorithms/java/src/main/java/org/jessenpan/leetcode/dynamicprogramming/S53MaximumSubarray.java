package org.jessenpan.leetcode.dynamicprogramming;

/**
 * @author jessenpan
 * tag:dynamicprogramming
 * //TODO classics
 */
public class S53MaximumSubarray {

    public int maxSubArray(int[] nums) {
        int max = nums[0], sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum = Math.max(sum + nums[i], nums[i]);
            max = Math.max(max, sum);
        }
        return max;
    }

}
