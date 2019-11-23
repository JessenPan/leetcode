package org.jessenpan.leetcode.dp;

/**
 * @author jessenpan
 * tag:dp
 */
public class S312BurstBalloons {

    public int maxCoins(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        return calc(nums, nums.length);
    }

    private int calc(int[] nums, int left) {
        if (left == 0) {
            return 0;
        }
        int len=nums.length;
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < left; i++) {
            if(nums[i]<0){
                continue;
            }
            if(i==0){
                
            }
        }
        return max;
    }

}
