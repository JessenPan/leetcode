package org.jessenpan.leetcode.array;

import java.util.Arrays;

/**
 * @author jessenpan
 * tag:array
 */
public class S724FindPivotIndex {

    public int pivotIndex(int[] nums) {
        if (nums.length <= 2) {
            return -1;
        }
        long leftSum = 0, rightSum = Arrays.stream(nums).sum() - nums[0];
        int i = 0, length = nums.length;
        while (true) {
            if (leftSum == rightSum) {
                return i;
            }
            i++;
            if (i >= (length - 1)) {
                break;
            }
            leftSum = leftSum + nums[i - 1];
            rightSum = (i == length - 1) ? 0 : rightSum - nums[i];
        }

        return -1;
    }

}
