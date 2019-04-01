package org.jessenpan.leetcode.math;

import java.util.Arrays;

/**
 * @author jessenpan
 * tag:math
 */
public class S628MaximumProductOfThreeNumbers {

    public int maximumProduct(int[] nums) {
        if (nums.length == 3) {
            return nums[0] * nums[1] * nums[2];
        }
        Arrays.sort(nums);
        int length = nums.length;
        int max = 0, tmpResult;
        max = nums[0] * nums[1] * nums[2];
        if ((tmpResult = nums[0] * nums[1] * nums[length - 1]) > max) {
            max = tmpResult;
        }
        if ((tmpResult = nums[length - 1] * nums[length - 2] * nums[length - 3]) > max) {
            max = tmpResult;
        }
        if ((tmpResult = nums[length - 1] * nums[length - 2] * nums[0]) > max) {
            max = tmpResult;
        }
        return max;
    }
}
