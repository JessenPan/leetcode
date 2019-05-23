package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:array
 */
public class S238ProductOfArrayExceptSelf {

    public int[] productExceptSelf(int[] nums) {
        int[] incNums = new int[nums.length];
        int[] descNums = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                incNums[i] = nums[i];
            } else {
                incNums[i] = incNums[i - 1] * nums[i];
            }
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            if (i == (nums.length - 1)) {
                descNums[i] = nums[i];
            } else {
                descNums[i] = descNums[i + 1] * nums[i];
            }
        }

        int[] productExceptSelfArrays = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int leftNum = (i - 1 < 0) ? 1 : incNums[i - 1];
            int rightNum = (i + 1 >= nums.length) ? 1 : descNums[i + 1];
            productExceptSelfArrays[i] = leftNum * rightNum;
        }
        return productExceptSelfArrays;
    }

}
