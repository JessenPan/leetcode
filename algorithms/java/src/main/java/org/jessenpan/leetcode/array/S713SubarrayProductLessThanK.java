package org.jessenpan.leetcode.array;

/**
 * @author jessenpan
 * tag:array
 */
public class S713SubarrayProductLessThanK {

    //TODO 
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        if (k <= 1) {
            return 0;
        }
        int sum = 1, num = 0, left = 0;
        for (int right = 0; right < nums.length; right++) {
            sum *= nums[right];
            while (sum >= k) {
                sum /= nums[left++];
            }
            num += right - left + 1;
        }
        return num;
    }

}
